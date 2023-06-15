import java.util.*;

public class checkcircular {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;

        }
    }

    static boolean circular(Node head) {
        if (head == null)
            return true;

        Node node = head.next;

        while (node != null && node != head) // This loop would stop in both cases (1) If // Circular (2) Not circular

        node = node.next; // If loop stopped because of circular // condition

        return (node == head);
    }


    static Node newNode(int data)
    {
        Node temp = new Node();
        temp.data = data;
        temp.next = null;
        return temp;
    }


    public static void main(String args[])
    {
        /* Start with the empty list */
        Node head = newNode(1);
        head.next = newNode(2);
        head.next.next = newNode(3);
        head.next.next.next = newNode(4);
  
        System.out.print(circular(head) ? "Yes\n"
                                          : "No\n");
  
        // Making linked list circular
        head.next.next.next.next = head;
  
        System.out.print(circular(head) ? "Yes\n"
                                          : "No\n");
    }
}
