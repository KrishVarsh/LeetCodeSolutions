class Solution {
    public String reverseWords(String s) {
        // Trim the input string to remove leading/trailing spaces
        s = s.trim();

        String[] words = s.split("\\s+"); // Split the input string into words using one or more spaces as the delimiter
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" ");
            }
        }

        return reversed.toString();








    }
}
