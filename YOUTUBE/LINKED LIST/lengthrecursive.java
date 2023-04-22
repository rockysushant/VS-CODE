
public class lengthrecursive {
    class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;

        }
    }

    static Node head = null;

    static Node tail = null;

    static Node ptr = null;

    public void push(int data) {
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            tail = newnode;
        }
        else{
            tail.next  = newnode;
            tail = newnode;
        }
       
    }

    // public int getCount(Node node) {
    //     if (node == null)
    //         return -1;

    //     return 1 + getCount(node.next);

    // }

    public  static void add(int x){
       
        val.data= x;
        val.next = head;
        val = head;

    }

    public void print(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.println(curr.data + "");
            curr = curr.next;
        }
    }
    public static void main(String[] args) {
      
        lengthrecursive llist = new lengthrecursive();

        llist.push(10);
        llist.push(20);
        llist.push(30);
        llist.push(40);
        llist.push(50);

    System.out.println("The List is");


        llist.print(head);

        add(111);



        
        // System.out.println("Count of nodes is " + llist.getCount(head));

    }

}
