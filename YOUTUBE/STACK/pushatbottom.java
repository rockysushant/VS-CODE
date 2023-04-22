
import java.util.*;

public class pushatbottom {
    
    public static void pushAt(int data, Stack<Integer> start){
        if(start.isEmpty()){
            start.push(data);
            return;

        }
        int top = start.pop();
        pushAt(data, start);
        start.push(top);

    }



    public static void main(String[] args) {
        Stack<Integer> start = new Stack<>();
        start.push(1);
        start.push(2);
        start.push(3);
        start.push(4);

        while(!start.isEmpty()){
            System.out.println(start.peek());
            start.pop();

        }
    }
}
