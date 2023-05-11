import java.io.*;
import java.util.*;
import java.math.BigDecimal;


public class BigDecimal {

    public static void main(String[] args) {

    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    String []s=new String[n+2];
    for(int i=0;i<n;i++){
        s[i]=sc.next();
    }
    sc.close();

    Arrays.sort(s, 0, n, (s1, s2)-> new BigDecimal(s2).compareTo(new BigDecimal(s1)));

    //Output
    for(int i=0;i<n;i++)
    {
        System.out.println(s[i]);
    }
    }
}