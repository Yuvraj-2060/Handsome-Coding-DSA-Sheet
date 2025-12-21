public class Pattern9 {
    public static void main(String[] args) {
        int n =5;

        for(int row=1;row<=n;row++){
            int totalSpace=n-row;
            for (int i = 1; i <=totalSpace ; i++)
                System.out.print("  ");
            for(int col=1;col<=row;col++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
