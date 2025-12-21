import java.util.HashMap;

public class FrequencyOfString {
    public static void main(String[] args) {
        String str = "aabcdabxyzab";
        char[] strArray = str.toCharArray();

        HashMap<Character, Integer> cntmap = new HashMap<Character, Integer>();

        for(int i=0;i<str.length();i++)
        {
            if(cntmap.containsKey(str.charAt(i)))
                cntmap.put(str.charAt(i), cntmap.get(str.charAt(i))+1 );

            else
                cntmap.put(str.charAt(i), 1);
        }
        System.out.println(cntmap);
    }
}
