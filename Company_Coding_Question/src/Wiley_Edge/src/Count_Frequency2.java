import java.util.HashMap;
import java.util.Map;

public class Count_Frequency2 {
    static void Count_Frequency(String s , int n){
        Map<Character,Integer> mp = new HashMap<>();

        for(int i=0;i<n;i++){
            if(!mp.containsKey(s.charAt(i)))
                mp.put(s.charAt(i),1);
            else
                mp.put(s.charAt(i),mp.get(s.charAt(i))+1);
        }
        System.out.println(mp);

    }
    public static void main(String[] args) {
        String str = "RAMAN";
        Count_Frequency(str,str.length());
    }
}
