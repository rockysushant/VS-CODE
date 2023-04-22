// package YOUTUBE.HASHSET;
import java.util.*;
// import java.util.Iterator;
public class hello {
    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(1);
        System.out.println(hs);
        
        if(hs.contains(1)){
            System.out.println("Set contains");
        }
        
        if(!hs.contains(2)){   // yeh kya kr rha hai smjh nhhi aarha
            System.out.println("noooo"); 
        }else{
            System.out.println("yes");
        }


    //  hs.remove(1);
    //  if(!hs.contains(1)){
    //     System.out.println("deleted");
    //  }
        


    
     Iterator itr = hs.iterator();
     while(itr.hasNext()){
        System.out.println(itr.next());
     }
    
    }
    
}
