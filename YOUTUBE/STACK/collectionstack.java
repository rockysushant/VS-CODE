import java.util.*;

public class collectionstack {
    
    public static void main(String[] args) {
        Stack s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        while(!s.isEmpty()){   // yeh kya hai    
            System.out.println(s.peek());
            s.pop();
        }


        System.out.println(s);
    }
}
