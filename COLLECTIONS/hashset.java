import java.util.*;

public class hashset {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("geeks");
        hs.add("for");
        hs.add("geeks");
        hs.add("is");
        hs.add("very");
        hs.add("helpful");
        Iterator<String> itr = hs.iterator(); //itertaor wahta the use
        while(itr.hasNext())
        { 
            System.out.println(itr.next());
        }

    }
}


// // op os very helpful
// geeks
// for
// geek os