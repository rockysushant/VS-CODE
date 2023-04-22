
import java.util.HashSet;
public class pairsum2 {

static boolean fun(int arr[],int arr2[], int n ,  int sum){
    HashSet<Integer> hs = new HashSet<>();

    for(int i =0; i<n; i++){
        if(hs.contains(sum))
        return true;
    
        hs.add(arr[i]+arr2[i]);
    }

    return false;
}

public static void main(String[] args) {
    int arr1[] = {1,2,3,4,5};

    int arr2[] = {2,4,5,6,8};

    // int sum = 10;
    System.out.println(fun(arr1,arr2, 5, 88));

}
}
