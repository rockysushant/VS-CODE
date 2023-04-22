
public class demo2 {

    public class solve {

        class Node {
            int data;
            Node next;

            Node(int x) {
                data = x;
                next = null;

            }
        }

        public static void main(String[] args) {

            int[] arr = { 20, 89, 89 };
            solve obj = new solve();
            obj.help(arr);

        }

        public void help(int[] arr) {

            Node dummy = new Node(-1);
            Node cur = dummy;
            for (int i = 0; i < arr.length; i++) {
                Node ans = new Node(arr[i]);
                cur.next = ans;
                cur = cur.next;
            }
            printList(dummy.next);
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
