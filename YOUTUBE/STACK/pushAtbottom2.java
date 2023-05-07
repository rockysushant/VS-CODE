import java.util.*;
public class pushAtbottom2 {
    

    static void pushAtbottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtbottom(s, data);
        s.push(top);
    }



    // REVERSE A STACK 

    static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtbottom(s, top);

    }


    static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }

    public static void main(String[] args) {
        
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);




        //  FOR REVERSE A STACK
        
        reverseStack(s);
        printStack(s);


        // FOR PUSHATBOTTOM

        // pushAtbottom(s,4);

        // while(!s.isEmpty()){
        //     System.err.println(s.pop());
        // }

    }
}
