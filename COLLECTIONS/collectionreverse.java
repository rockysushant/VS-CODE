import java.io.*;
import java.util.*;

public class collectionreverse{
    
    public static void main(String[] args) {
        List<String> myList = new ArrayList<String>();

        myList.add("one");
        myList.add("two");
        myList.add("three");
        myList.add("four");
        // System.out.println("checked list:" +myList);


        Collections.reverse(myList);   

        for(int i = 0; i < myList.size(); i++){
            if(i == myList.size()-1){
                System.out.print(myList.get(i));
            }else{
                System.out.print(myList.get(i)+" ,");
            }
        }

        for(String item: myList){
            System.out.print(item+" ,");
        }

        System.out.println("reversed lsit is :" + myList );

    }
}
