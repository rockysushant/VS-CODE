
public class height {
    

    static class Node{
        int data;
        Node left,right;

        Node(int data){
            this.data = data;
            this.left  = null;
            this.right = null;

        }

    }
    

    // HEIGHT NO OF NODES

    public static int height(Node root){

        if(root == null){
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);

        return Math.max(left, right) +1;


    }



    // COUNT NO OF NODES

    public static int count(Node root){
        if(root == null){
            return 0;
        }
 
        int left = count(root.left);                           // count kaise kiya?
        int right = count(root.right);

        return left+right+1;
    }



     public static int sum(Node root){
        if(root == null){
            return 0;
        }

        int left = sum(root.left);
        int right = sum(root.right);

        return left+right+root.data;                    // ADD KAISE KIYA

    }



    // DIAMETER OF TREE

    static int diameter(Node root){
        if(root == null){
            return 0;

        }
        int leftdiam  = diameter(root.left);
        int leftheight = height(root.left);
        int rightdiam = diameter(root.right);
        int rightheight = height(root.right);

        int selfdiam = leftheight+ rightheight+1;
        return Math.max(selfdiam,Math.max(leftdiam, rightdiam));

    }


    public static void main(String[] args) {
        Node root  = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(diameter(root));
    }
}
