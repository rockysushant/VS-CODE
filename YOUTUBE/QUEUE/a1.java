import java.util.*;

public class a1 {
    
    public static void main(String[] args) {
         PriorityQueue<Integer>  q = new PriorityQueue();
         
         q.add(1);
         q.add(2);
         q.add(3);
         q.add(4);


          
         while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();

         }

        //  System.out.println(q);


    }
}
