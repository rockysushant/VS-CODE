// package SINGLY;

public class deletelast {
    
    class Node{
        int data;
        Node next;

    }

    Node deleteLast(Node head)           //this and class is same any problem?
    {
        if(head == null)
        return null;
        if(head.next = null)          // == and = 
        return null;

        Node curr = head;
        while(curr.next.next!= null)
        curr = curr.next;
        curr.next = null;
        return head;

    }
    public static void main(String[] args) {
        Node head = null;
        head = deleteLast(head, 30);
        head = deleteLast(head, 20);
        head = deleteLast(head, 10);
        return 0;
    }


}
