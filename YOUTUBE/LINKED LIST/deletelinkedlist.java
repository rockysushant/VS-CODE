public class deletelinkedlist {
    
    class Node{
        int data;
        Node next;

        Node(int x){
            data = x;
            next = null;

        }

    }


    static Node head = null;
    static Node tail = null;

    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;

        }else{

            tail.next = newNode;
            tail = newNode;
        }

    }


    public void delete(){

        head == null;
    }


    public static void main(String[] args) {
        deletefirst obj = new deletefirst();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);



        System.out.println("Deleting the list");
        obj.delete();
 
        System.out.println("Linked list deleted");
        
    }
}
