
import java.util.*;

public class s1 {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;

        }
    }

    static class Stack {
        public static Node head;

        public static boolean isEmpty() {
            return head == null;

        }

        public static void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;

            }
            newNode.next = head;
            head = newNode;

        }

        public static int pop() {
            int top = head.data;
            head = head.next;
            return top;

        }
    }

    public static void main(String[] args) {
        Stack start = new Stack();
        start.push(1);
        start.push(2);
        start.push(3);
        start.push(4);

        while (!start.isEmpty()) {
            System.out.println(start.pop()); // yeh toh smjhh gye ki peek upar ka return krega , toh pop ka mtlb kya
                                             // hota hai
            // start.pop();

        }
    }
}
