import java.io.*;
import java.util.*;

public class twomatricesareequal {
    
    public static void main(String[] args) {
        int a[] = { 30, 25, 40};
        int b[] = { 30, 5, 40};

        boolean result = Arrays.equals(a,b);
        if(result == true){
            System.out.println("they are same");
        }

        else{
            System.out.println("not same"); 
        }

        
    }
}
