import java.util.*;
public class collectionframework {
    
    
    public static void main(String[] args) {
    
        Stack<Integer> start = new Stack<>();
        start.push(1);
        start.push(2);
        start.push(3);
    
        System.out.println(start);

        System.out.println(start.peek());
        
        System.err.println(start.pop());
        
        System.err.println(start);

        start.push(22);
        System.out.println(start);
       
    
        
        System.err.println(start.size());

   
    
    }
}
