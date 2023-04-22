import java.util.*;
// import java.io.*;
public class insertend {
    Node head;

    class Node
    {
        int data;
        Node next;

        Node(int x){
            data = x;
            next = null;

        }

    }

    class Test{           // class ke andar class nhi na le skte?
        public static Node insertEnd(Node head, int x)
        {
            Node temp = new Node(x);
            if(head == null)
            return temp;

            Node curr = head;
            while(curr.next!= null)
            curr = curr.next;
            curr.next = temp;                
            return temp;

        }
        public static void main(String[] args) {
            
            // Node head = null;
            // head = insertEnd(head, 30);
            // head = insertEnd(head, 20);
            // head = insertEnd(head, 10);
            // return;



            LinkedList<Integer>list = new LinkedList();

    
    
            list.push(10);
            list.push(20);
            list.push(30);
            list.push(40);
            list.push(50);
    
            System.out.println(list);
        }

    }
}
