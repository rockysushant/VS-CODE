import java.io.*;
import java.util.*;
public class searchrecursevily {
    
Node head;
    class Node{
        int data;
        Node next;

        Node(int x){
            data = x;
            next = null;

        }
    }


    public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next  = head;
        head = new_node;

    }


    public boolean search(LinkedList<Integer> list, int x){
        if(head == null){
            return false;
        }
        if(head.data == x){
            return true;
        }

        return search(head.next, x);
    }


    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);

        System.err.println(list);
        

        int x = 21;
        // Function call
      if (list.search(list.head, x))
          System.out.println("Yes");
      else
          System.out.println("No");

    


    }
}
