import java.util.*;
import java.util.LinkedList;

public class solve {

    class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;

        }
    }

    // public void push(int new_data){
    // Node new_node = new Node(new_data);
    // new_node.next = head;
    // head = new_node;
    // }

    static Node head = null;
    static Node tail = null;

    public void push(int data) {
       
        Node newNode = new Node(data);
        
        if (head == null) {
           
            head = newNode;

            tail = newNode;
        } else {
           
            tail.next = newNode;

            tail = newNode;
        }

    }

    public int count(int search_for) {

        Node current = head;
        int count = 0;
        while (current != null) {
            if (current.data == search_for)
                count++;
            current = current.next;

        }
        return count;

    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        solve obj = new solve();

        obj.push(10);
        obj.push(10);
        obj.push(10);
        obj.push(40);
        obj.push(50);

        // list.add(10);
        // list.add(10);
        // list.add(30);
        // list.add(40);
        // list.add(50);

        System.out.println(obj.count(10));

        // System.out.println(list.count(10));
    }

}
