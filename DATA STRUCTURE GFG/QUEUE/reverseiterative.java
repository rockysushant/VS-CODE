import java.util.*;
import java.io.*;

public class reverseiterative {

    public int reverse(Queue<Integer> q){
        Stack<Integer> s;
        while(q.isEmpty() == false){
            s.push(q.remove());
        }

        while(s.isEmpty() == false){
            q.add(s.pop());
        }
  

    }
    
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<Integer>();
        Stack<Integer> s = new Stack<Integer>();
        
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        System.out.println(reverse);

        
    }
}
