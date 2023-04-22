
public class searchiterative {
  
    class Node{
        int data;
        Node next;

        Node(int x){
            data = x;
            next = null;

        }
    }

    static Node head = null;
    static Node tail  = null;

    public void push(int data){

        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail  = newNode;

        }else{
            tail.next = newNode;
            tail = newNode;
        }

    }



    int search(Node head, int x)
    {
        int pos = 1;
        Node curr = head;
        while(curr!= null)
        {
            if(curr.data == x)
            return pos;
            else{
                pos++;
                curr = curr.next;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        searchiterative obj = new searchiterative();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);

        System.err.println(obj.search(head, 20));



   
    }
    

}
