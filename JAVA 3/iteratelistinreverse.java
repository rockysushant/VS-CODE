import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class iteratelistinreverse {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("geeks");
        list.add("only");

        ListIterator<String> gfg_itr = list.listIterator(list.size()); // what is gfg_itr
        while(gfg_itr.hasPrevious()){
            System.out.println(gfg_itr.previous());
        }
        for(int i = list.size()-1; i>=0; i--)
      {
          System.out.println(list.get(i));
      }

    }
    
}
