import java.io.*;
import java.util.*;

public class usingvedistanceleftrotation {
    public static void main(String[] args) {
        List<Integer> mylist = new ArrayList<>();
        mylist.add(10);
        mylist.add(20);
        mylist.add(30);
        mylist.add(40);
        mylist.add(50);
        mylist.add(60);
        mylist.add(70);
        System.out.println("list before rotation" +Arrays.toString(mylist.toArray()));
        Collections.rotate(mylist, -4);
        System.out.println("list after rotation" +Arrays.toString(mylist.toArray()));

    }

}
