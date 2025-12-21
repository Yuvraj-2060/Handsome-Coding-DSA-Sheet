import java.util.*;
public class Token_String_Test1 {
    public static String stringChallenge(String str) {
        String challengeToken = "tp42rgmie6f";
        StringBuilder compressedStr = new StringBuilder();
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                compressedStr.append(count).append(str.charAt(i - 1));
                count = 1;
            }
        }
        compressedStr.append(count).append(str.charAt(str.length() - 1));
        StringBuilder rev = new StringBuilder(challengeToken);
        System.out.println(compressedStr);
        compressedStr.reverse();
        rev.reverse();
        String finalOutput = compressedStr.toString() +":"+ rev;
        return new StringBuilder(finalOutput).toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String finalOutput = stringChallenge(input);
        System.out.println(finalOutput);

    }

}
