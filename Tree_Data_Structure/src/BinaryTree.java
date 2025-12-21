import  java.util.*;
public class BinaryTree {
    public BinaryTree() {

    }

    private static class Node {
        int value;
        Node left;
        Node right;
        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    private void populate(Scanner sc) {
        System.out.println("Enter The Root Node :");
        int val = sc.nextInt();
        root = new Node(val);
        populate(sc, root);
    }
    private void populate(Scanner sc, Node node) {
        System.out.println("Do You Want Enter Left Side Of : " + node.value);
        boolean left = sc.nextBoolean();
        if (left) {
            System.out.println("Enter The Left Side Value Of : " + node.value);
            int value = sc.nextInt();
            node.left = new Node(value);
            populate(sc, node.left);
        }
        System.out.println("Do You Want Enter Right Side Of : " + node.value);
        boolean right = sc.nextBoolean();
        if (right) {
            System.out.println("Enter The Left Side Value Of 50: " + node.value);
            int value = sc.nextInt();
            node.right = new Node(value);
            populate(sc, node.right);
        }

    }
    private void display(){
        display(root,"");
    }
    private void display(Node node, String indent){
        if(node==null)
            return;
        System.out.println(indent + node.value);
        display(node.left,indent+"\t");
        display(node.right, indent+"\t");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree obj = new BinaryTree();
        obj.populate(sc);
        obj.display();
    }
}
