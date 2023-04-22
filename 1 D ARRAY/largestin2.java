import java.util.*;

public class largestin2 {
    

    public static void main(String[] args) {
       
        int[] newArray = new int[]{2, 1, 5, 8, 7};
        int largestNo = 0;
        for(int i=0; i<newArray.length; i++){
            if(newArray[i] > largestNo){
                largestNo = newArray[i];
            }
        }
        System.out.println("The largest no is : "+ largestNo);
    }
}
