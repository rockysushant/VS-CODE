import java.util.*;
import java.io.*;
public class reverseIndividualWords {
    

    static void reverse(String str){
        Stack<Character> s = new Stack<>();


        // Traverse given string and push all
        // characters to stack until we see a space.
        for(int i = 0;i<str.length(); ++i){
            if(str.charAt(i) != ' '){
                s.push(str.charAt(i));
            }

             // When we see a space, we print
            // contents of stack.
            else{
                while(s.isEmpty() == false){
                    System.err.print(s.pop());
                }
                System.out.print(" ");
            }
        }


         // Since there may not be space after
        // last word.
        while(s.isEmpty()== false){
            System.out.print(s.pop());
        }
    }




    public static void main(String[] args) {

        String str = "Geeks For Geeks";
        reverse(str);

    }
}
