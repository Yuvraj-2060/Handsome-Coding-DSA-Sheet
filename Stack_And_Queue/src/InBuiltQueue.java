import java.util.*;
class InBuiltQueue{
    public static void main(String[] args) {
        Queue<Integer> Q = new LinkedList<>();

        Q.add(10);
        Q.add(20);
        Q.add(30);
        Q.add(40);
        Q.add(50);

        System.out.println("Queue Elements : "+Q);

        System.out.println("Removed Element Is : "+Q.remove());
        System.out.println("Removed Element Is : "+Q.remove());
        System.out.println("Removed Element Is : "+Q.remove());
        System.out.println("Removed Element Is : "+Q.remove());
        System.out.println("Removed Element Is : "+Q.remove());
//        System.out.println("Removed Element Is : "+Q.remove());
    }
}