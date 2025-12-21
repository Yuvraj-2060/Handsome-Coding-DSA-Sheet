public class CLL {
    private Node head;
    private Node tail;
    public CLL() {
        this.head = null;
        this.tail = null;
    }
    public void insertFirst(int data){
        Node newnode = new Node(data);
        if(head==null){
          head = newnode;
          tail=newnode;
          tail.next = head;
          return;
        }
        tail.next = newnode;
        newnode.next = head;
        tail = newnode;
    }
    public void delete(int data){
        Node temp = head;
        if(temp==null){
            System.out.println("Linked List Is Empty");
            return;
        }
        if(temp.data==data){
            head = head.next;
            tail.next = head;
            return;
        }
        do{
            Node n = temp.next;
            if(n.data == data){
                temp.next = n.next;
                break;
            }
            temp = temp.next;
        }while(temp!=head);
    }
    public void display(){
        Node temp = head;
        System.out.print("\nSTART-->");
        if(head!=null){
            do{
                System.out.print("|"+temp.data+"|-->");
                temp = temp.next;
            }while(temp!=head);
        }
        else System.out.println("Linked List Is Empty");
        System.out.print("START");
    }
    private static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    public static void main(String[] args) {
        CLL obj = new CLL();

        obj.insertFirst(10);
        obj.insertFirst(20);
        obj.insertFirst(30);
        obj.insertFirst(40);
        obj.insertFirst(50);
        obj.display();

        obj.delete(50);
        obj.display();
    }
}
