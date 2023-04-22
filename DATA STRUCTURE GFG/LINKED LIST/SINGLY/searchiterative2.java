import java.io.*;
import java.util.*;
import java.util.LinkedList;

public class searchiterative2 {
    class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;

        }
    }

    static Node head = null;
    static Node tail = null;

    public void add(int data) {

        Node newNode = new Node(data);
        if (head == null) {
            
            head = newNode;

            tail = newNode;
        } else {
            // newNode will be added after tail such that tail's next will point to newNode
            tail.next = newNode;
            // newNode will become new tail of the list
            tail = newNode;
        }

    }

    public boolean search(Node head, int x) {

        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            if (current.data == x) {

                return true;

            }
            current = current.next;

        }
        return false;

    }

    public static void main(String[] args) {
        
        searchiterative2 obj = new searchiterative2();

        obj.add(10);
        obj.add(20);
        obj.add(30);
        obj.add(40);
        obj.add(50);


        int x = 10;

        if (obj.search(head, x)) {
            System.out.println("yes");     // yha par yes no lyu liye jab upar yes no th ahoi toh
        } else {
            System.out.println("no");
        }

    }

}
