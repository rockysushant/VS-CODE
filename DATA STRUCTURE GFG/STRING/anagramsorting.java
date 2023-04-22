import java.util.*;

public class anagramsorting {
    
    public static boolean arrAna(String s1, String s2){
        if(s1.length()!= s2.length())
        return false;

        char a1[] = s1.toCharArray();     // else lagaye ya nhi aur { }
        Arrays.sort(a1);                     // array or arrays mein kya diff hai
         s1 = new String(a1);


         char a2[] = s2.toCharArray();
         Arrays.sort(a2);
         s2 = new String(a2);

         return s1.equals(s2);
    }


    public static void main(String[] args) {
        // String s1 = "listen";
        // String s2 = "silent";
        System.out.println(arrAna(Listen, silent));
    }
}






//  tc = O(nlogn)     its saying that in sorrting funvrtion take nlogn
