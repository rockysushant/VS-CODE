public class insertbegin {

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

    public  void push(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;

        }else{
            tail.next = newNode;
            tail = newNode;
        }
       
    }


    // INSERT
     
    // public int insert(int x){
    //     Node newNode = new Node(x);
    //     if(head == null){
    //         head = newNode;
    //         tail = newNode;
    //     }
    // }



    
    // void add(int x ){
    //    ptr.val = x;
    //    ptr.next = head;
    //    ptr = head;

        
    // }

    public   void print(Node head){
        Node curr = head;
        while(curr!=null){
            System.err.println(curr.data + " ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        insertbegin list = new insertbegin();

        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);


        list.print(head);

    }



}
