import java.util.Iterator.*;
import java.util.Iterator;
import java.util.LinkedList;

public class iteratealinkeslistinreversed {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("hey");
        ll.add("you");
        ll.add("geeks");
        ll.add("baby");
        System.out.println(ll);
        Iterator<String>iterator = ll.descendingIterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

    }

}

