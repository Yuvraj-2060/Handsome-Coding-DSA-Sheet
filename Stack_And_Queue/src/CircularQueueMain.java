public class CircularQueueMain {
    public static void main(String[] args) throws QueueException {
        CircularQueue Q = new CircularQueue(5);

        Q.insert(3);
        Q.insert(10);
        Q.insert(40);
        Q.insert(50);
        Q.insert(60);


        Q.display();

        System.out.println("\nRemoved Eleemnt : "+Q.remove());
        Q.insert(70);
        Q.display();


    }
}
