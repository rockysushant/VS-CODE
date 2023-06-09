// Java program to reverse a Queue
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// Java program to reverse a queue
public class reverseaQueue {

	static Queue<Integer> queue;

	// Utility function to print the queue
	static void Print()
	{
		while (!queue.isEmpty()) {
			System.out.print(queue.peek() + ", ");
			queue.remove();
		}
	}

	// Function to reverse the queue
	static void reversequeue()
	{
		Stack<Integer> stack = new Stack<>();
		while (!queue.isEmpty()) {
			stack.add(queue.peek());
			queue.remove();
		}
		while (!stack.isEmpty()) {
			queue.add(stack.peek());
			stack.pop();
		}
	}


	public static void main(String args[])
	{
		queue = new LinkedList<Integer>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);
		
        System.out.println("The original Queue is");
        System.out.println(queue);

		reversequeue();
        System.out.println("The Updated Queuw Is");
		Print();
	}
}
// This code is contributed by Sumit Ghosh
