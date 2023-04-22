import java.util.*;

 public class descending {

    public static void main(String[] args) {
        Integer array[] = {1,2,3,4,5,9,54,33}; 
        System.out.println(Collections.reverse(array));
        Arrays.sort(array, Collections.reverseOrder());// hm toh reverse use kiye descending kyu hp gya
        System.out.println( Arrays.toString(array));
    }
}
