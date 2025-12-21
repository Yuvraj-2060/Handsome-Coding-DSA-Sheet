import java.util.*;

public class Tricky_Frequency {
    public static void main(String[] args) {
        String str[] = {"Veer","Yuvi","Shakti","Veer","Shakti","Veer", "abc", "02020&$DFDff", "def", "abc", "02020&$DFDff"};
        System.out.println(Arrays.toString(str));

        String updatedArr[] = newArray(str);
        System.out.println(Arrays.toString(updatedArr));
    }
    static String[] newArray(String[] str){
        String newArr[] = new String[str.length];

        for(int i=0;i< str.length;i++) {
            String curName = str[i];
            int cnt =0;

            for(int j=0;j<=i;j++){
                if(str[j].equals(curName))
                    cnt++;
            }
            if(cnt==1)
                newArr[i] = curName;
            else
                newArr[i] = curName+cnt;
        }
        return newArr;
    }
}
