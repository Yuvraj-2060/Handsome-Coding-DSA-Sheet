package CompanyOA_Questions;

import java.util.Scanner;

public class Solution3_getNextPalindrome {
    public static int getNextPalindrome(int N) {
        while (true) {
            N++; // Start checking the next number
            if (isPalindrome(N)) {
                return N;
            }
        }
    }

    // Helper function to check if a number is a palindrome
    private static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int N = scan.nextInt();

        int result = getNextPalindrome(N);

        System.out.println("Next palindrome: " + result);
    }
}
