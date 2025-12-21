
import java.util.Scanner;

public class Q1_NoOfStringAppear {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        String text = scanner.nextLine();
	        String name = scanner.nextLine();

	        int count = 0;
	        int pos = 0;
	        while ((pos = text.indexOf(name,pos)) != -1) {
	            count++;
	            pos += name.length();
	        }
	        System.out.println(count);

	        scanner.close();
	    }
}

//			****** Using String Builder *******

//public class Q1_NoOfStringAppear {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        String text = scanner.nextLine();
//        String name = scanner.nextLine();
//
//        StringBuilder sb = new StringBuilder(text);
//        int count = 0;
//        int pos = sb.indexOf(name);
//        while (pos != -1) {
//            count++;
//            pos = sb.indexOf(name, pos + name.length());
//        }
//
//        System.out.println(count);
//
//        scanner.close();
//    }
//}



