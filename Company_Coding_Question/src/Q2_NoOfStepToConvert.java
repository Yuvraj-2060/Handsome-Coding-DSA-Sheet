//package Mindstik;
import java.util.*;

public class Q2_NoOfStepToConvert {
	static int minSteps(String str1, String str2) {
        Queue<String> q = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        q.add(str1);
        visited.add(str1);

        int steps = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                String curr = q.remove();
                if (curr.equals(str2)) {
                    return steps;
                }
                for (int k = 2; k <= curr.length(); k++) {
                    for (int j = 0; j <= curr.length() - k; j++) {
                        StringBuilder sb = new StringBuilder(curr);
                        String next = sb.replace(j, j + k, new StringBuilder(curr.substring(j, j + k)).reverse().toString()).toString();
                        if (!visited.contains(next)) {
                            q.add(next);
                            visited.add(next);
                        }
                    }
                }
            }
            steps++;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println(minSteps(str1, str2));
    }
}

//import java.util.*;
//
//public class Q2_NoOfStepToConvert {
//    static int minSteps(String str1, String str2) {
//        if (str1.length() != str2.length()) {
//            return -1;
//        }
//
//        int[] charCount1 = new int[26];
//        int[] charCount2 = new int[26];
//
//        for (char c : str1.toCharArray()) {
//            charCount1[c - 'a']++;
//        }
//
//        for (char c : str2.toCharArray()) {
//            charCount2[c - 'a']++;
//        }
//
//        for (int i = 0; i < 26; i++) {
//            if (charCount1[i] != charCount2[i]) {
//                return -1;
//            }
//        }
//
//        int steps = 0;
//        int i = 0;
//        int j = 0;
//        while (i < str1.length() && j < str2.length()) {
//            if (str1.charAt(i) != str2.charAt(j)) {
//                j++;
//                steps++;
//            } else {
//                i++;
//                j++;
//            }
//        }
//        return steps;
//    }
//
//
//    public static char[] swap(char[] str, int i, int j) {
//        char[] newStr = new char[str.length];
//        for (int k = 0; k < str.length; k++) {
//            newStr[k] = str[k];
//        }
//        char temp = newStr[i];
//        newStr[i] = newStr[j];
//        newStr[j] = temp;
//        return newStr;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str1 = sc.next();
//        String str2 = sc.next();
//        System.out.println(minSteps(str1, str2));
//    }
//}



