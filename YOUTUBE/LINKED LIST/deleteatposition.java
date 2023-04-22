public class deleteatposition {

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

        Node newNode = new Node(data);

        if (head == null) {

            head = newNode;

            tail = newNode;
        } else {

            tail.next = newNode;

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



    // public static void printList(Node head) {
    //     Node curr = head;
    //     int index  =0;

    //     while (curr != null) {
    //         if(index == 0){

    //             System.out.print("["  );
    //             System.out.print( curr.data);
    //         }
    //       else{
    //         System.out.print( "," + curr.data);
    //       }
            
           
    //       index++;
    //         curr = curr.next;
    //     }

    //     System.out.print("]"  );

    // }

    public static void printList(Node head) {
        Node curr = head;
        
        while (curr != null) {
            System.out.println(curr.data + "");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {

        deleteatposition llist = new deleteatposition();

        llist.push(1);
        llist.push(2);
        llist.push(3);
        llist.push(4);
        llist.push(5);

        System.out.println("\nCreated Linked list is:");
        llist.printList(head);

        llist.deleteNode(3);
        System.out.println("\nLinked List after Deletion at position 3: ");
        llist.printList(head);

     

    }
}
