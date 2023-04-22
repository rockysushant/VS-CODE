
public class linkedlist {

    class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;

        }
    }

    class Test {
        public static void main(String[] args) {

            int[] arr = { 20, 89, 89 };

            Node dummy = new Node(-1);
            Node cur = dummy;
            for (int i = 0; i < arr.length; i++) {
                Node ans = new Node(arr[i]);
                cur.next = ans;
                cur = cur.next;
            }
            printList(dummy.next);
            // Node head = new Node(10);
            // head.next = new Node(20);
            // head.next.next = new Node(30);
            // head.next.next.next = new Node(40);

        }

        public static void printList(Node head) {
            Node curr = head;
            while (curr != null) {
                System.out.println(curr.data + "");
                curr = curr.next;

            }
        }
    }

}
