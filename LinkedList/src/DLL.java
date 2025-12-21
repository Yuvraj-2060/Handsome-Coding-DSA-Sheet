import java.util.*;
import java.io.*;
public class DLL {
    private class Node{
        int data;
        Node next,prev;

        public Node(int data) {
            this.data = data;
        }
    }
    private Node head;

    public int count(){
        Node temp = head;
        int cnt = 0;
        while(temp!=null) {
            temp = temp.next;
            cnt++;
        }
        return cnt;
    }
    public void insertFirst(int data){
        Node newnode = new Node(data);
        newnode.prev = null;
        newnode.next = null;
        if(head==null){
            head = newnode;
            return;
        }
        newnode.next = head;
        head.prev = newnode;
        head = newnode;
    }
    public void insertLast(int data){
        if(head==null) {
            insertFirst(data);
            return;
        }
        Node newnode = new Node(data);
        int n = count();
        Node temp = head;
        for(int i=1;i<n;i++){
            temp = temp.next;
        }
        temp.next = newnode;
        newnode.prev = temp;
    }
    public void insert(int data){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Position Where You Wanna Insert : ");
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
        newnode.next = temp.next;
        temp.next.prev = newnode;
        temp.next = newnode;
        newnode.prev = temp;
    }
    public int deleteFirst(){
        if(head == null) {
            System.out.println("Linked List Is Empty");
            return -1;
        }
        int temp = head.data;
        head = head.next;
        head.prev = null;
        return temp;
    }
    public int deleteLast(){
        if(head == null) {
            System.out.println("Linked List Is Empty");
            return -1 ;
        }
        Node prev = head;
        int n = count();
        for(int i=1;i<n-1;i++)
            prev = prev.next;
        Node temp = prev.next;
        prev.next = null;
        temp.prev = null;
        return temp.data;
    }
    public int delete(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Position To Delete : ");
        int pos = sc.nextInt();

        if(pos==1) {
            deleteFirst();
            return -1;
        }
        if(pos==count()){
            return deleteLast();

        }
        Node prev = head;
        for(int i=1;i<pos-1;i++){
            prev = prev.next;
        }
        Node temp = prev.next;
        prev.next = temp.next;
        temp.next.prev = prev;
        return temp.data;
    }
    public void display(){
        Node temp = head;
        Node last = null;
        System.out.print("Start-->");
        while(temp!=null){
            System.out.print(temp.data+"-->");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");

        System.out.println("Print In Reverse :");
        while(last!=null){
            System.out.print(last.data+"-->");
            last = last.prev;
        }
        System.out.println("START");
    }
    public static void main(String[] args) {
        DLL obj = new DLL();

        obj.insertFirst(10);
        obj.insertFirst(20);
        obj.insertFirst(30);
        obj.insertFirst(40);

//        System.out.println("\nNumber Of Nodes Are : "+obj.count());
//        obj.display();
//
//        obj.insertLast(101);
//        obj.display();
//
//        obj.insert(201);
//        obj.display();
//
//        System.out.println("Delete First : "+obj.deleteFirst());
//        obj.display();
//
//        System.out.println("Delete Last : "+obj.deleteLast());
        obj.display();

        System.out.println("Deleted Element is : "+obj.delete());
        obj.display();
    }
}
