import java.io.*;
import java.util.*;

public class rotateelemtoflist {
    public static void main(String[] args) {
        List<Integer> mylist = new ArrayList<>();
        mylist.add(10);
        mylist.add(20);
        mylist.add(30);
        mylist.add(40);
        mylist.add(50);
        mylist.add(60);
        mylist.add(70);
        mylist.add(80);
        mylist.add(90);
        mylist.add(100);

        System.out.println("List before rotation:" +Arrays.toString(mylist.toArray()));
        for(int i = 0; i<4; i++)
        {
            int temp = mylist.get(6);
            for(int j = 6; j>0; j--)
            {
                mylist.set(j,mylist.get(j-1));
            }
            mylist.set(0,temp);
        }


        System.out.println("list after rotation "  + Arrays.toString(mylist.toArray()));


    }

}
