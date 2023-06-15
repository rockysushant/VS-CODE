import java.util.ArrayDeque;
import java.util.Deque;

public class parenthesesUsingDeque {
    

    public static boolean isValid(String str){
        Deque<Character> s = new ArrayDeque<>();
        for(int i = 0; i<str.length(); i++){
            char x = str.charAt(i);
            if(x == '(' || x == '{' || x == '[')
            s.push(x)
        }else{
            if(s.isEmpty() == false)
            return false;
            else if(Matching(s.peek(),x) == false)
        }

    }
    public static void main(String[] args) {
        
        String str = "{([])}";
        System.out.println(isValid(str));
    }
}
