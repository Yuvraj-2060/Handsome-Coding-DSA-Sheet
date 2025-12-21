public class Pattern7 {
    public static void main(String[] args) {
        int n = 5;

        for(int row=1;row<=n;row++){
            int totalSpace = n-row;
            for(int j=1;j<=totalSpace;j++)
                System.out.print(" ");
            for(int col=1;col<=row;col++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
