import java.util.*;
public class b1 {
    
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int idx = -1;

    }
     public static Node buildTree(int nodes[]){
        idx++;
        if(nodes[idx] == -1);
        return null;
     }
     Node newNode = new Node(nodes[idx]);
     newNode.left = buildTree(nodes);
     newNode.right = buildTree(nodes);

     return newNode;



     public static void main(String[] args) {
        
        int nodes[] = {-1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree Tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
     }



     // Inorder

     public static void inorder(Node root){
        if(root == null){
            return ;                 // 0 nhi hoga lekin laga rhe hai toh erroe de rha hai kyu

        }

        inorder(root.left);
        System.out.println(root);
        inorder(root.right);
     }


     

}
