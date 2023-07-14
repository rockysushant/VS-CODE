import java.util.*;
import java.util.LinkedList;

public class demo {

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static Node head = null;
    static Node tail = null;

    public void push(int data) {
        // Create a new node

        Node newNode = new Node(data);
        // Checks if the list is empty
        if (head == null) {
            // If list is empty, both head and tail will point to new node
            head = newNode;

            tail = newNode;
        } else {
            // newNode will be added after tail such that tail's next will point to newNode
            tail.next = newNode;
            // newNode will become new tail of the list
            tail = newNode;
        }

    }

    void deleteNode(int position) {
        int count = 1;
        Node cur = head;
        if (position == 1) {
            head = cur.next;
            return;
        }
        while (count != position - 1) {
            cur = cur.next;
            count++;
        }
        cur.next = cur.next.next;
    }

    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.data + "");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {

        demo llist = new demo();

        llist.push(7);
        llist.push(1);
        llist.push(3);
        llist.push(2);
        llist.push(8);

        System.out.println("\nCreated Linked list is: " + llist);

        llist.deleteNode(1);
        llist.printList(head);

        System.out.println("\nLinked List after Deletion at position 4: ");

    }















    //jdivhidhvdovihodihvvn
    nioodnv

    //ncwdncoidcnwdc
    //ndiobcowibcw'c
    //dicbwducbbcuwi
    //bicbowcnowncw

}
