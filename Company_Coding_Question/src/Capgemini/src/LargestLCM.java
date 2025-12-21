import java.util.*;

public class LargestLCM {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int largestLCM = findLargestLCM(arr);
        System.out.println("The largest LCM in set S is: " + largestLCM);
    }

    public static int findLargestLCM(int[] arr) {
        Set<Integer> S = new HashSet<Integer>();
        for (int i = 1; i < arr.length; i++) {
            int lcm = (arr[i] * arr[i-1]) / gcd(arr[i], arr[i-1]); // calculate LCM using GCD
            S.add(lcm); // add LCM to set S
        }
        return Collections.max(S); // find the maximum value in S using Collections.max()
    }

    public static int gcd(int a, int b) { // helper function to calculate GCD
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

}
