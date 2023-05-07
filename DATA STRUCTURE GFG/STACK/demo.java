import java.util.Stack;

public class demo {
	public static void main(String[] args) {
		// Create a new stack
		Stack<Integer> stack = new Stack<>();

		// Push elements onto the stack
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);

        System.err.println(stack);

		// Pop elements from the stack
		// while(!stack.isEmpty()) {
		// 	System.out.println(stack.pop());
		// }


        // for(int i = 0; i<=3; i++){
        //     System.out.println(stack.pop());
        // }
	}
}
