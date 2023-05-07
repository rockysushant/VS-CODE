
public class demo {


    static Node head;
    static Node tail;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;

        }
    }


    public static void main(String[] args) {
        demo obj = new demo();
        obj.head = new Node(1);
        obj.head.next  = new Node(2);
        System.out.println(obj);
        
    }
    
   
}
