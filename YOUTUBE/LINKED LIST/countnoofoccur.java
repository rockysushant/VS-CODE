import java.util.*;
import java.util.LinkedList;

public class countnoofoccur {

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

    public  static void print(){
        Node curr = head;
        while(curr!=null){
            System.err.println(curr.data);
            curr = curr.next;
        }
    }


    public static void main(String[] args) {
      

    
        countnoofoccur obj = new countnoofoccur(5);

        obj.push(10);
        obj.push(10);
        obj.push(50);
        obj.push(40);
        obj.push(50);


        System.out.println("The List is");

        print();




        // for(int i = 0; i<obj; i++){
        //     System.out.println(obj);
        // }


        System.out.println(obj.count(10));

    }

}
