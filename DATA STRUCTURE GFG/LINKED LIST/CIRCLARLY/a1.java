// package CIRCLARLY;

public class a1 {
    
    class Node{
        int data;
        Node next;

        Node(int d){
            data= d;
            next = null;
        }
    }

    class Test{
        public static void main(String[] args) {
            Node head = new Node(10);
             head.next = new Node(10);
             head.next.next = new Node(10);
             head.next.next.next = new Node(10);
             head.next.next.next.next = new Node(10);
          
        }
    }
}
