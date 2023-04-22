
public class Aimplementation {
    // Node head;

    // class Node {
    //     int data;
    //     Node next;

    //     Node(int x) {
    //         data = x;
    //         next = null;
    //     }
    // }

    // class Test {
    //     public static void main(String[] args) {

    //         Node head = new Node(10);
    //         head.next = new Node(20);
    //         head.next.next = new Node(30);
    //         head.next.next.next = new Node(40);

    //     }

    //     public static void printList(Node head) {
    //         Node curr = head;
    //         while (curr != null) {
    //             System.out.println(curr.data + "");
    //             curr = curr.next;
    //         }
    //     }
    // }



    Node head;

    class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;

        }
    }

    public void help(){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
          head.next.next.next.next.next = new Node(60);


        Node curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    public static void main(String[] args) {


   
        Aimplementation obj = new Aimplementation();

        obj.help();

    }








}



