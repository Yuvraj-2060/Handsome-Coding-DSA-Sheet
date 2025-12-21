package Yuvraj_DSA;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] acc = {
                {1,2,3},
                {4,1,6},
                {3,3,7}
        };
        System.out.println("Maximum Wealth Is : "+maximumWealth(acc));
    }
    static int maximumWealth(int[][] accounts){
        int maxW = Integer.MIN_VALUE;

        for(int i=0;i< accounts.length;i++){
            int rowSum=0;
            for(int j=0;j<accounts[i].length;j++){
                rowSum +=accounts[i][j];
            }
            if(rowSum>maxW)
                maxW = rowSum;
        }
        return maxW;
    }
}
