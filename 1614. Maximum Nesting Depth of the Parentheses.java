class Solution {
    public int maxDepth(String s) {
        int ct = 0;
        int maxDepth = 0; // Variable to store the maximum nesting depth
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                ct++;
                maxDepth = Math.max(maxDepth, ct); // Update maxDepth when encountering an open parenthesis
            }
            if (s.charAt(i) == ')') {
                ct--;
            }
        }
        return maxDepth;
    }
}
