public class LongestUniqueSubstring {
    public static boolean isUnique(String str,int i, int j){
        boolean visited[] = new boolean[26];
//        String finalStr="";
        int finalLen=0;

        for(int k=i;k<=j;k++){
            if(visited[str.charAt(k)-'a']==true)
                return false;
            else {
//                finalStr = finalStr+str.charAt(k);
//                finalLen = Math.max(finalLen, finalStr.length());
                visited[str.charAt(k) - 'a'] = true;
            }
        }
//        System.out.println("Final String Is : "+finalStr);
        return true;
    }
    public static int longestUniqueStr(String str) {
        int n = str.length();
        int res=0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if(isUnique(str,i,j)){
                    res = Math.max(res,j-i+1);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String str="shaktiiiiiiioooooo";
        System.out.println("Input String Is : "+str);

        int res = longestUniqueStr(str);
        System.out.println("ThereFore, Longest Unique String Length Is : "+res);
    }

}
