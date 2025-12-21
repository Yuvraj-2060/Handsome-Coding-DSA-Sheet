package CompanyOA_Questions;

import java.util.Scanner;

public class Solution2_scoreString {

    public static int scoreString(String str) {
        int score = 0;

        // Check for palindromes of length 4
        for (int i = 0; i < str.length() - 3; i++) {
            String substring = str.substring(i, i + 4);
            if (isPalindrome(substring)) {
                score += 5;
            }
        }

        // Check for palindromes of length 5
        for (int i = 0; i < str.length() - 4; i++) {
            String substring = str.substring(i, i + 5);
            if (isPalindrome(substring)) {
                score += 10;
            }
        }

        return score;
    }

    private static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scan.next();

        int result = scoreString(str);

        System.out.println("Score of the string: " + result);
    }
}