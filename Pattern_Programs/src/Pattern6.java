public class Pattern6 {
    public static void main(String[] args) {
        int n = 5;

        for(int row=1;row<=2*n;row++){
            int totalCol = row>n ? 2*n-row : row;
            int totalSpace = n-totalCol;
            for(int space=1;space<=totalSpace;space++)
                System.out.print(" ");
            for(int col=1;col<=totalCol;col++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
