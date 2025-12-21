import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Tree {
    static Scanner sc=null;
    public static void main(String[] args) {
        sc = new Scanner(System.in);

        Node root =  createTree();

        System.out.print("IN-ORDER TRAVERSAL : ");
        inOrder(root);
        System.out.println();

        System.out.print("PRE-ORDER TRAVERSAL : ");
        preOrder(root);
        System.out.println();

        System.out.print("POST-ORDER TRAVERSAL : ");
        postOrder(root);
        System.out.println();

        System.out.println("Maximum Height Of A Tree : "+maxHeight(root));
        System.out.println("Size Of A Tree : "+sizeOfTree(root));
        System.out.println("Maximum Node : "+maxNode(root));
        System.out.println("Minimum Node : "+minNode(root));
        printLevelOrderSameLine(root);
        System.out.println();
        printLevelOrderNewLine(root);

        System.out.println("\nEnter node to delete:");
        int nodeToDelete = sc.nextInt();
        deleteNode(root, nodeToDelete);
        System.out.print("IN-ORDER TRAVERSAL after deleting " + nodeToDelete + " : ");
        inOrder(root);
        System.out.println();
    }
    static  Node createTree(){
        System.out.println("Enter Data");
        int data = sc.nextInt();

        if(data==-1)    return null;

        Node root = new Node(data);

        System.out.println("Enter Left Data Of : "+data);
        root.left = createTree();

        System.out.println("Enter Right Data Of : "+data);
        root.right = createTree();

        return root;
    }
    static void inOrder(Node root){
        if(root==null)  return;

        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    static void preOrder(Node root){
        if(root==null) return;

        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    static void postOrder(Node root){
        if(root==null) return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    static int maxHeight(Node root){
        if(root==null)  return 0;

        return Math.max(maxHeight(root.left),maxHeight(root.right))+1;
    }
    static int sizeOfTree(Node root){
        if(root==null)  return 0;
        return sizeOfTree(root.left)+sizeOfTree(root.right)+1;
    }
    static int maxNode(Node root){
        if(root ==null)
            return -1;//Integer.MIN_VALUE;
        return Math.max(root.data,Math.max(maxNode(root.left),maxNode(root.right)));
    }
    static int minNode(Node root){
        if(root == null)
            return Integer.MAX_VALUE; // Return Integer.MAX_VALUE instead of Integer.MIN_VALUE
        return Math.min(root.data, Math.min(minNode(root.left), minNode(root.right)));
    }
    static void printLevelOrderSameLine(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            Node cur = q.poll();
            System.out.print(cur.data);

            if(cur.left!=null)  q.add(cur.left);
            if(cur.right!=null) q.add(cur.right);
        }
    }
    static Node deleteNode(Node root, int key) {
        // Base case: If the tree is empty, return null
        if (root == null) return root;

        // If the key to delete is smaller than the root's key,
        // then it lies in the left subtree
        if (key < root.data)
            root.left = deleteNode(root.left, key);

        // If the key to delete is greater than the root's key,
        // then it lies in the right subtree
        else if (key > root.data)
            root.right = deleteNode(root.right, key);
        else {
            // Node to delete found

            // Case 1: Node with only one child or no child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // Case 2: Node with two children
            // Get the inorder successor (smallest in the right subtree)
            root.data = minNode(root.right);

            // Delete the inorder successor
            root.right = deleteNode(root.right, root.data);
        }
        return root;
    }

//    static int minValue(Node root) {
//        int minv = root.data;
//        while (root.left != null) {
//            minv = root.left.data;
//            root = root.left;
//        }
//        return minv;
//    }


    static void printLevelOrderNewLine(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node cur = q.poll();

            if(cur==null) {
                if (q.isEmpty())
                    return;
                q.add(null);
                System.out.println();
                continue;
            }
            System.out.print(cur.data);
            if(cur.left!=null)  q.add(cur.left);
            if(cur.right!=null) q.add(cur.right);
        }
    }

}
class Node{
    Node left , right;
    int data;
    public Node(int data) {

        this.data = data;
    }
}
