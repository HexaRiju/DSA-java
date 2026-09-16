package Tree;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data, Node left, Node right){
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
public class Tra{
    public static void main(String[] args){
        // let the tree is given.
        Node node = new Node(0, null, null);
        preOrder(node);
        inOrder(node);
        postOrder(node);
    }
    public static void preOrder(Node node){
        if(node == null)
            return;
        System.out.println(node.data);
        preOrder(node.left);
        preOrder(node.right);
    }
    public static void inOrder(Node node){
        if(node == null)
            return;
        inOrder(node.left);
        System.out.println(node.data);
        inOrder(node.right);
    }
    public static void postOrder(Node node){
        if(node == null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.data);
    }
}