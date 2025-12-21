package Mindstix_Software_Lab;

public class InterLeaveArrays {

    public static void main(String[] args) {
        // Example arrays
        char[] S1 = {'a', 'c', 'e'};
        char[] S2 = {'b', 'd', 'f', 'g', 'h'};

        // Create an empty array with the combined length of S1 and S2
        char[] S3 = new char[S1.length + S2.length];

        // Populate S3 by interleaving characters from S1 and S2
        interleaveArrays(S1, S2, S3);

        // Print the resulting interleaved array
        System.out.println("Interleaved array: ");
        for (char c : S3) {
            System.out.print(c + " ");
        }
    }

    public static void interleaveArrays(char[] S1, char[] S2, char[] S3) {
        int i = 0, j = 0, k = 0;

        // Iterate until one of the arrays is completely traversed
        while (i < S1.length && j < S2.length) {
            S3[k++] = S1[i++];
            S3[k++] = S2[j++];
        }

        // If S1 has remaining characters, add them to S3
        while (i < S1.length) {
            S3[k++] = S1[i++];
        }

        // If S2 has remaining characters, add them to S3
        while (j < S2.length) {
            S3[k++] = S2[j++];
        }
    }
}
