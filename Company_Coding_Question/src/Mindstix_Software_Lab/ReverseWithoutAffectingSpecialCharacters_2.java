package Mindstix_Software_Lab;

public class ReverseWithoutAffectingSpecialCharacters_2 {

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
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (!Character.isLetter(arr[left])) {       // Find the next alphabetic character from the left
                left++;
                continue;
            }
            if (!Character.isLetter(arr[right])) {      // // Find the next alphabetic character from the right
                right--;
                continue;
            }
            // Swap the characters
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move the pointers
            left++;
            right--;
        }
    }
}

