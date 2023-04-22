

import java.util.*;

public class search {


    public static boolean fun(Node root ,int key){[]
        if(root == null){
            return false;
        }

        if(root.data<key){
            return (root.right,key);
        }
        else if(root.data==key){
            return true;

        }
        else{
            return search(root.left,key);
        }
    }


    public static void main(String[] args) {
        int value = {8,5,3,4,1,4,5,77,88,2,3};
        if(search(root,1)){
            System.out.println("found");
        }else
        System.out.println("not found");
    }
}
