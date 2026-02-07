package Handsome_Coding_DSA_Sheet.randomQUESTIONS;

import java.util.HashSet;

public class HappyNumber {

        public static boolean isHappy(int n) {
            HashSet<Integer> seen = new HashSet<>();

            while (n != 1) {
                if (seen.contains(n)) {
                    return false; // cycle detected
                }
                seen.add(n);
                n = getNext(n);
            }
            return true;
        }

        private static int getNext(int n) {
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            return sum;
        }

    public static void main(String[] args) {
            int num1=19;
            int num2=11;
        System.out.println("Is "+num1+" is Happy Number ? "+ isHappy(num1));
        System.out.println("Is "+num2+" is Happy Number ? "+ isHappy(num2));

    }
}
