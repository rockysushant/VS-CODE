import java.util.*;
import java.io.*;
import java.util.Scanner;

public class demo {
    
    Scanner scan = new Scanner(System.in);
    String a = scan.next();
    String b = scan.next();
    scan.close();

    a = a.toLowerCase();
    b = b.toLowerCase();

    ArrayList<Character> arrayList1 = new ArrayList<>();
    ArrayList<Character> arrayList2 = new ArrayList<>();

    for(int i = 0; i < a.length(); i++){
        arrayList1.add(a.charAt(i));
    }Collections.sort(arrayList1);

    for(int j = 0; j < b.length(); j++){
        arrayList2.add(b.charAt(j));
    } Collections.sort(arrayList2);

    if(arrayList1.equals(arrayList2)){
        System.out.println("Anagrams");
    }
    else{
        System.out.println("Not Anagrams");
    }

}

