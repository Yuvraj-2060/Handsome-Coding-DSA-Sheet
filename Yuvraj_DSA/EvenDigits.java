package Yuvraj_DSA;

public class EvenDigits {
    public static void main(String[] args) {
        int arr[] = {18,124,9,1764,98,13};
        System.out.println("Number Of Even Digits In Array IS : "+findNumbers(arr));

    }
    static int findNumbers(int[] nums){
        int cnt=0;

        for(int x : nums){
            if(even(x)) cnt++;
        }
        return cnt;
    }

    private static boolean even(int x) {
        int num =x;int cnt=0;
        while(num!=0){
            cnt++;
            num = num/10;
        }
        if(cnt%2==0)    return true;
        else return false;
    }

}
