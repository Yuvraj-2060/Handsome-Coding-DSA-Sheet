public class QueueMain {
    public static void main(String[] args) throws QueueException{
        CustomQueue Q = new CustomQueue(5);

        Q.insert(10);
        Q.insert(20);
        Q.insert(30);
        Q.insert(40);
        Q.insert(50);
        //Q.insert(50);

        Q.display();

        System.out.println("Removed Item Is : "+Q.remove());
        Q.display();
    }
}
