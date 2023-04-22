// import javax.xml.crypto.Data;

public class searchrecursively {
    
    class Node{
        int data;
        Node next;

        Node(int x){
            data = x;
            next = null;

        }
    }

    public void push(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;

        }
    }

    public int search(int x){
        if(head == null) return -1;
        if(head.data == x)
        return 1;


    }else{
        int res = search(head.next,x);
        if(res==-1) return -1;
        else return(res+1);
    }



    public static void main(String[] args) {
        searchrecursevily list = new searchrecursevily();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
    }
}
