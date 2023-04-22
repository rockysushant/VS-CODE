
import java.io.*;
import java.util.Arrays;

public class medianof{
    public static int isSort(int arr[]){
        int n = arr.length;
        if(n%2 == 0)
        {
            int z = n/2;
            int e = arr[z];
            int q = arr[z-1];

            int ans = (e+q)/2;
            return ans;
        }

        else{
            int z = Math.round(n/2);
            return arr[z];
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {-5,3,6,12,15};
        int[] arr2 = {-12,-10,-6,-3,4,10};

        int i = arr1.length;
        int j = arr2.length;

        int[] arr3 = new int[i+j];

        System.arraycopy(arr1, 0, arr3, 0, i);
        System.arraycopy(arr2, 0, arr3, 0, j);

        Arrays.sort(arr3);
        

        System.out.println(isSort(arr3));

    }


}
