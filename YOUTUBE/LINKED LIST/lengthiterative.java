import java.util.*;
public class lengthiterative {

    class Node{
        int data;
        Node next;
        Node(int x){
            data = x;
            next =null;

        }
    }

    static Node head = null;
    static Node tail = null;

    public void push(int new_data){
        Node newNode = new Node(new_data);
        
        if(head == null){
            head = newNode;
            tail = newNode;

        }
        else{
            tail.next = newNode;
            tail = newNode;

        }
       
    }

    public int getCount(){
       Node temp = head;  
       int count = 0;

       while(temp!=null){
        count++;
        temp = temp.next;
       }

       return count;


       
      static void print(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.println(curr.data + "");
            curr = curr.next;
        }
    }

    public static void main(String[] args)
    {
     lengthiterative llist = new lengthiterative();

        llist.push(1);
        llist.push(3);
        llist.push(1);
        llist.push(2);
        llist.push(1);
        
        print(head);

        
 
          
        System.out.println("Count of nodes is "   + llist.getCount(head));
                        
    }
    

    }

}

