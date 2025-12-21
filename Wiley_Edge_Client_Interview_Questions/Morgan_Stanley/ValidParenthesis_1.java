package Wiley_Edge_Client_Interview_Questions.Morgan_Stanley;

public class ValidParenthesis_1 {
    public static void main(String[] args) {
        String str = "[{()(())}{}]";
        boolean result = isValid(str);
        System.out.println(result);
    }
    public static boolean isValid(String s) {
        while(true){
            if (s.contains("()")){
                s=s.replace("()","");
            }
            else if(s.contains("[]")){
                s=s.replace("[]","");
            }
            else if(s.contains("{}")){
                s=s.replace("{}","");
            }
            else
                return s.isEmpty();
        }
    }
}
