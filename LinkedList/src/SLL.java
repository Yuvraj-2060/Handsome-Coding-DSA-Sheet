import java.util.*;

public class SLL {
    private class Node {
        private int data;
        private Node next;

        Node(int data) {
            this.data = data;
        }
    }
    private Node head;      // by default, it will carry null
    private Node tail;     // by default, it will carry null
    public void insertFirst(int data){
        Node newnode = new Node(data);
        newnode.next = null;
        if(head==null){
            head = newnode ; tail = newnode;
            return;
        }
        else {
            newnode.next = head;
            head = newnode;
        }
//        head = newnode;
//        if(tail==null)
//            tail=head;
    }
    public void insertLast(int data){
        if(head==null)
            insertFirst(data);
        else {
            Node newnode = new Node(data);
            newnode.next = null;
            tail.next = newnode;
            tail = newnode;
        }
    }
    public void insert(int data){
//        if(tail==null)
//            insertFirst(data);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Position where you wanna Insert : ");
        int pos = sc.nextInt();
        if(pos==1) {
            insertFirst(data);
            return;
        }
        Node newnode = new Node(data);
        Node temp = head;
        for(int i=1;i<pos-1;i++){
            temp = temp.next;
        }
        newnode.next=temp.next;
        temp.next = newnode;
    }
    // Merge Two Sorted LinkedList

    public static SLL merge(SLL first,SLL second){
        Node head1 = first.head;
        Node head2 = second.head;

        SLL ans = new SLL();

        while (head1!=null && head2!=null){
            if(head1.data<head2.data) {
                ans.insertLast(head1.data);
                head1 = head1.next;
            }
            else {
                ans.insertLast(head2.data);
                head2 = head2.next;
            }
        }
        while(head1!=null){
            ans.insertLast(head1.data);
            head1 = head1.next;
        }
        while(head2!=null){
            ans.insertLast(head2.data);
            head2 = head2.next;
        }
        return ans;
    }
    public void deleteFirst(){
        int temp = head.data;
        head = head.next;
        if(head==null)
            tail=null;
        System.out.println("\nDeleted Item Is : "+temp);
    }
    public int deleteLast(){
        Node temp = head;
        int size = count();
        for(int i=1;i<size-1;i++)
            temp = temp.next;
        int del = temp.next.data;
        temp.next = null;
        return del;
    }
    public void delete(){
        System.out.println("Enter Element You Position You Wana Delete :");
        Scanner sc = new Scanner(System.in);
        int pos = sc.nextInt();
        if(pos==1) {
            deleteFirst();
            return;
        }
        Node prev = head;
        for(int i=1;i<pos-1;i++){
            prev = prev.next;
        }
        int del = prev.next.data;
        Node temp = prev.next;
        prev.next = temp.next;
        System.out.println("Deleted Element : "+del);
    }
    public int count(){
        Node temp = head;
        int cnt = 0;
        while(temp!=null) {
            temp = temp.next;
            cnt++;
        }
        return cnt;
    }
    public void reverseSLL(){
        Node prevv = null;
        Node curr = head;
        Node nextp;
        while(curr!=null){
            nextp = curr.next;
            curr.next = prevv;

            prevv = curr;
            curr = nextp;
        }head = prevv;
    }
    public void display() {
        Node temp = head;
        System.out.print("START-->");
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.print("NULL\n");
    }

    public static void main(String[] args) {

//        SLL obj = new SLL();
//        obj.insertFirst(20);
//        obj.insertFirst(10);
//        obj.insertFirst(25);
//        obj.insertFirst(30);
//
//        obj.insertLast(100);
//        obj.display();
//
//        obj.insert(400);
//        obj.display();
//
//        obj.deleteFirst();
//        obj.display();
//
//        System.out.println("No. Of Node : "+obj.count());
//
//        System.out.println("Deleted Last Node : "+obj.deleteLast());
//
//        obj.display();
//
//        obj.delete();
//        obj.display();
//
//        obj.reverseSLL();

//        obj.display();
        SLL first = new SLL();
        SLL second = new SLL();

        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);
        first.insert(20);

        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(9);
        second.insertLast(14);


        SLL ans = SLL.merge(first,second);
        ans.display();
        first.display();
        second.display();
    }

}
