import java.util.*;

public class reverse {
    
    public static void main(String[] args) {
        
        Integer array[] = {1,552,3,4,8,55,5};  //  i want in reverse order but this is happening in descending order
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println( Arrays.toString(array));
    }
}
