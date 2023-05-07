import java.util.*;

public class reverseString {
  
    static void reverse(StringBuilder str) {
        
        Stack<Character> s = new Stack<>();
        
        for (int i = 0; i < str.length(); i++)
            s.push(str.charAt(i));
    
        str.delete(0, str.length());
       
        while (!s.empty()) {
            str.append(s.peek());
            s.pop();
        }
    }

    public static void main(String[] args) {
       
        StringBuilder str = new StringBuilder("abc");
       
        reverse(str);
       
        System.out.println("Reversed string is : " + str);
    }
}
