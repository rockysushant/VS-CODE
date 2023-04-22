import java.io.*;
import java.util.*;
public class floydstriangle {
    
    public static void main(String[] args) {
        int rows = 4; numbers = 1;
        for(int i = 1; i<=rows; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(numbers +" ");
                ++numbers;
            }
            System.out.println();
        }
    }
}

