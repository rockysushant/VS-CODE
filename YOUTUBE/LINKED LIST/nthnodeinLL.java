
public class nthnodeinLL {

    class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;

        }
    }

    public int getSearch(int index) {
        Node current = head;

        int count = 0;

        while (current != null) {

            if (count == index)
                return current.data;
            count++;
            current = current.next;
        }

        return 0;

    }

    static Node head = null;
    static Node tail = null;

    public void add(int data) { // upar add aur neeche add
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;

        } else {
            tail.next = newNode;
            tail = newNode;
        }

    }

    public void printList(Node head) {
        Node curr = head;
        while (curr != null) {

            System.out.println(curr.data + "");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {

        nthnodeinLL list = new nthnodeinLL();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("The List is");

        list.printList(head);

        System.out.println("The Searched List at index ");

        System.out.println(list.getSearch(1));

    }

}
