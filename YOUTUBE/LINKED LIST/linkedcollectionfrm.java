// using collection framework

import java.util.*;   

public class linkedcollectionfrm {
    
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("a");
        list.addFirst("is");
        System.err.println(list);

        list.addLast("list");
        list.addFirst("this");
        System.err.println(list);


        System.out.println(list.size());

        for(int i = 0; i<list.size();i++){
            System.out.print(list.get(i) + " ->");
        }
        System.out.println("null");



        list.removeFirst();

        System.out.println(list);


        list.removeLast();
        System.out.println(list);


        list.remove(1);
        System.out.println(list);


    }


}
