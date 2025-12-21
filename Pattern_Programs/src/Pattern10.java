public class Pattern10 {
    public static void main(String[] args) {
        int n = 5;

        for(int row=1;row<=n;row++){
            int space = n-row;
            for(int sp=1;sp<=space;sp++)
                System.out.print("  ");

            for(int col=row;col>=1;col--)
                    System.out.print(col + " ");
            for(int col=2;col<=row;col++)
                System.out.print(col + " ");

            System.out.println();
        }
    }
}
