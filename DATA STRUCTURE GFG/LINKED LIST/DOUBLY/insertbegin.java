import javax.swing.plaf.TableUI;

public class insertbegin {
      
    Node head;
    class Node{
        int data;
        Node prev;
        Node next;
       
        Node(int x){
            data = x;
            next = prev = null;
        }
    }


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




    public void insertBegin(Node head, int x){
        Node newNode = new Node(data);
        newNode.next = head;
        if(head!=null){
            head.prev = newNode;
            return newNode;
            
        }
    }


    public static void main(String[] args) {
        insertbegin list = new insertbegin();

        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        list.insertBegin(null, 10);
    }
}
