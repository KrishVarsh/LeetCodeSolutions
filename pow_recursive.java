public class Solution {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1.0;
        }

        // Handle negative exponent recursively
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }

        return recursivePow(x, n);
    }

    private double recursivePow(double x, int n) {
        // Base case
        if (n == 0) {
            return 1.0;
        }

        // Recursive case: split the problem into subproblems
        double halfPow = recursivePow(x, n / 2);

        // Combine the results of subproblems
        if (n % 2 == 0) {
            // If n is even, x^n = (x^(n/2))^2
            return halfPow * halfPow;
        } else {
            // If n is odd, x^n = x * (x^(n/2))^2
            return x * halfPow * halfPow;
        }
    }}

    //

//  import java.util.*;
//  public class Main{
//  public static double myPow(double x, int n) {
//     double ans = 1.0;
//     long nn = n;
//     if (nn < 0) nn = -1 * nn;
//     while (nn > 0) {
//       if (nn % 2 == 1) {
//         ans = ans * x;
//         nn = nn - 1;
//       } else {
//         x = x * x;
//         nn = nn / 2;
//       }
//     }
//     if (n < 0) ans = (double)(1.0) / (double)(ans);
//     return ans;
//   }
