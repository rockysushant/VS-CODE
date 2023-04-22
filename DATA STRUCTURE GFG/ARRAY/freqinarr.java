// package ARRAY;

public class freqinarr {
    public static int freeQ(int arr[], int n)
    {
        int freq = 1, i = 1;
        while(i<n){
            while(i<n && arr[i] == arr[i-1]);
            {
                freq++;

            }
        }
    }

    public static void main(String[] args) {
        int arr[]  = {1,2,3,4,5,6,6,7};
        System.err.println(freeQ(arr));
    }
}
