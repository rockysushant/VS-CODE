// import b1.Node;
import java.util.*;

public class countofnodes {
    

    public static int fun(Node root){
        if(root== null){
            return 0;
        }
        int left = fun(root.left);
        int right = fun(root.right);
        return leftNode + rightNode +1;

    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,-1};
        fun(null);

    }
}
