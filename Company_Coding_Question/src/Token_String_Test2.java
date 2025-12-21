import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Token_String_Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String output = stringChallenge(input);
        System.out.println(output);
    }

    public static String stringChallenge(String sen) {
        String regex = "[^abcdefghijklmnopqrstuvwxyz1234567890]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sen);
        String cleaned_sen = matcher.replaceAll("").toLowerCase();

        String[] sen_split = cleaned_sen.split("\\s+");

        int length_greatest = 0;
        String longest_word = "";
        for (String word : sen_split) {
            int length = word.length();
            if (length > length_greatest) {
                length_greatest = length;
                longest_word = word;
            }
        }
        System.out.println(longest_word);

        String final_output = new StringBuilder(longest_word).reverse().toString()
                + ":" + new StringBuilder("tp42rgmie6f").reverse().toString();

        return final_output;
    }
}
