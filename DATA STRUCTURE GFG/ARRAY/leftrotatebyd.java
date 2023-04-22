package ARRAY;

public class leftrotatebyd {
    
    public static void rotateBy(int arr[], int n)
    {
        int temp = arr[0];
        for(int i = 1; i<n; i++)  
        arr[i-1] = arr[i];
        arr[n-1] = temp;

    }
    public static void rotateBy(int arr[], int n,int d)
    {
        for(int i = 0; i<d; i++)
       
            rotateBY(arr, n);
        
    }

public static void main(String[] args) {
        int arr[] = {1,12,3,4,5};
        System.err.println(rotateBy(arr, 2));
}
}
