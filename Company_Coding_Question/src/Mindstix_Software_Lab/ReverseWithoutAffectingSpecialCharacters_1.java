package Mindstix_Software_Lab;

import java.util.Stack;

public class ReverseWithoutAffectingSpecialCharacters_1 {

    public static void main(String[] args) {
        // Example character array
        char[] arr = {'a', 'b', 'c', '!', 'd', 'e', 'f', '@', 'g', 'h', 'i'};

        // Print the original array
        System.out.println("Original array: ");
        System.out.println(arr);

        // Reverse the array without affecting special characters
        reverseArray(arr);

        // Print the reversed array
        System.out.println("Reversed array: ");
        System.out.println(arr);
    }

    public static void reverseArray(char[] arr) {
        // Create a stack to store alphabetic characters
        Stack<Character> stack = new Stack<>();

        // Push alphabetic characters onto the stack
        for (char c : arr) {
            if (Character.isLetter(c)) {
                stack.push(c);
            }
        }
        // Pop characters from the stack and replace the alphabetic characters in the array
        for (int i = 0; i < arr.length; i++) {
            if (Character.isLetter(arr[i])) {
                arr[i] = stack.pop();
            }
        }
    }
}
