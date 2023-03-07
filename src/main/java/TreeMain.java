import java.util.LinkedList;
import java.util.Queue;

public class TreeMain {

    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    static class BinaryTree{
        static int idx = -1;
        static Node buildBinaryTree(int[] nodes){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildBinaryTree(nodes);
            newNode.right = buildBinaryTree(nodes);
            return newNode;
        }

        static void preOrder(Node root){
            if(root == null){
                return;
            }
            System.out.println(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }

        static void inOrder(Node root){
            if(root == null){
                return;
            }

            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }

        static void postOrder(Node root){
            if(root == null){
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.data);
        }

        static void levelOrder(Node root){

            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            queue.add(null);

            if(root == null){
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.data);
        }
    }

    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = BinaryTree.buildBinaryTree(nodes);
        BinaryTree.preOrder(root);
//        BinaryTree.inOrder(root);
//        BinaryTree.postOrder(root);
    }
}
