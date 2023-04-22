import java.util.*;
public class deletefirst {


    Node head;

    class Node{
        int data;
        Node next;

        Node(int x){
            data = x;
            next = null;
            
        }

    }

    Node delHead(Node head)
    {
        if(head == null)
        return null;
        else
        return head.next;
    }



    
    public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next  = head;
        head  = new_node;
    }

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedLists();
        list.push(10);
        list.push(30);
        list.push(11);
        list.push(21);
        list.push(14);
        System.err.println(list);

      
    }
}
