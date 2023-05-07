import java.util.*;
public class Largest {
    
    // -infinity   Integer.MIN_VALUE;
     // +infinity   Integer.MAX_VALUE;

    public static int get(int number[]){
        int largest = Integer.MIN_VALUE;

        for(int i = 0;i<number.length; i++){
            if(largest<number[i]){
                largest = number[i];
            }
        }

        return largest;                 
    }

    public static void main(String[] args) {
        int number[] = {1,2,32,64,3,8,43,9};
        get(number);

        
       System.out.println(" the largest value is " +  get(number));
    }



}
