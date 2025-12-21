package CompanyOA_Questions;

import java.util.Scanner;

public class Solution1_SumOfPrimeFActors {

    public static int sumOfPrimeFactors(int num) {
        int sum = 0;
        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                sum += i;
                num /= i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scan.nextInt();

        int result = sumOfPrimeFactors(num);

        System.out.println("Sum of prime factors: " + result);
    }
}
