import java.util.*;
import java.util.Stack;

public class reverseStackUsingRecursion {

    static Stack<Character> s = new Stack<>();

    static void insertaAtBottom(char x) {
        if (s.isEmpty()) {
            s.push(x);
        } else {

            char a = s.peek();
            s.pop();
            insertaAtBottom(x);
            s.push(a);

        }
    }

    static void reverse() {

        if (s.size() > 0) {

            char x = s.peek();
            s.pop();
            reverse();

            insertaAtBottom(x);
        }
    }

    public static void main(String[] args) {

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);


        System.out.println("Original Stack");


        System.out.println(s);
    }
}
