// class Solution {
//     public String longestPalindrome(String s) {
//         int n = s.length();
//         String longestPalindrome = "";

//         // Iterate through all possible substrings
//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j <= n; j++) {
//                 String substring = s.substring(i, j);
                
//                 // Check if the substring is a palindrome
//                 if (isPalindrome(substring) && substring.length() > longestPalindrome.length()) {
//                     longestPalindrome = substring;
//                 }
//             }
//         }

//         return longestPalindrome;
//     }

//     private boolean isPalindrome(String str) {
//         int left = 0;
//         int right = str.length() - 1;

//         while (left < right) {
//             if (str.charAt(left) != str.charAt(right)) {
//                 return false;
//             }
//             left++;
//             right--;
//         }

//         return true;
//     }
// }
class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        
        // Create a 2D array to store whether a substring is a palindrome
        boolean[][] dp = new boolean[n][n];
        
        int start = 0; // Starting index of the longest palindrome
        int maxLength = 1; // Length of the longest palindrome
        
        // All substrings of length 1 are palindromes
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }
        
        // Check substrings of length 2
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;
                start = i;
                maxLength = 2;
            }
        }
        
        // Check substrings of length 3 or more
        for (int len = 3; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                if (dp[i + 1][j - 1] && s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = true;
                    start = i;
                    maxLength = len;
                }
            }
        }
        
        return s.substring(start, start + maxLength);
    }
}
