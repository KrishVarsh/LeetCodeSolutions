class Solution {
    public String frequencySort(String s) {
    if (s.length() < 3)
        return s;

    // Step 1: Count the frequency of each character and find the maximum frequency (max)
    int max = 0;
    int[] map = new int[256];
    for (char ch : s.toCharArray()) {
        map[ch]++;
        max = Math.max(max, map[ch]);
    }

    // Step 2: Create an array of buckets to store characters based on their frequency
    String[] buckets = new String[max + 1]; // create max buckets

    // Step 3: Join characters with the same frequency in the same bucket
    for (int i = 0; i < 256; i++) {
        String str = buckets[map[i]];
        if (map[i] > 0)
            buckets[map[i]] = (str == null) ? "" + (char) i : (str + (char) i);
    }

    // Step 4: Create a sorted string by concatenating characters from buckets in descending order
    StringBuilder strb = new StringBuilder();
    for (int i = max; i >= 0; i--) {
        if (buckets[i] != null)
            for (char ch : buckets[i].toCharArray())
                for (int j = 0; j < i; j++)
                    strb.append(ch);
    }

    // Step 5: Return the final sorted string
    return strb.toString();
}

}
