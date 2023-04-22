// package ARRAY;/
import java.util.*;

public class deletion {
    
    public static int deleteAt(int arr[] , int n, int x)  // insertion or deletion ke liye space chorna padega lya
    {
        int i ;
        for(i = 0; i<n; i++)
        if(arr[i] == x)
        break;
        if( i == n)
        return n;
        for(int j = i; j<n-1; j++)
        arr[i] = arr[j+1];
        return(n-1);

    }
    public static void main(String[] args) {
        int result = deleteAt(arr(3,8,12,5, 1, 12));
        System.err.println(result);
    }
}
