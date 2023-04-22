public class deletehead {
  
    class Node{
        int data;
        Node prev;
        Node next;
       
        Node(int x){
            data = x;
            next = prev = null;
        }
    }


    static Node head = null;
    static Node tail = null;

    public void push(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
            

        }
        else{
            tail.next = newNode;
            tail.prev = null;
            tail  = newNode;

        }
    }


    Node delete(Node head){
        if(head == null) return null;
        if(head.next == null) return null;

        else{
            head = head.next;
            head.prev = null;
            return head;
        }
    }




    int print(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.println(curr.data + " ");
            curr = curr.next;

        }
    }

    public static void main(String[] args) {

        deletehead list = new deletehead();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        list.print(head);
        
        // list.delete(10);
        
    }
}
