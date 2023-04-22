import java.io.*;

public class deletefirst {

        Node head; 

        class Node {
            int data;
            Node next;

            Node(int d) {
                data = d;
                next = null;
            }
        }
     
        void deleteNode(int key) {
          
            Node temp = head, prev = null;

           
            if (temp != null && temp.data == key) {
                head = temp.next;
                return;
            }

           
            while (temp != null && temp.data != key) {
                prev = temp;
                temp = temp.next;
            }

            if (temp == null)
                return;

   
            prev.next = temp.next;
        }

        
        public void push(int new_data) {
            Node new_node = new Node(new_data);
            new_node.next = head;
            head = new_node;
        }

       
 

   
        public static void main(String[] args) {
           deletefirst llist = new deletefirst();

            llist.push(1);
            llist.push(2);
            llist.push(3);
            llist.push(4);

            System.out.println("\nCreated Linked list is:" );
            

            llist.deleteNode(1); // Delete node with data 1

            System.out.println(
                    "\nLinked List after Deletion of 1:");
           
        }
    // }

}
