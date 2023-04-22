// package ARRAY;

public class opertion {
    public static int search(int arr[], int n, int x)
    {
        for(int i = 0; i<n; i++){
        if(arr[i] == x)
        return i;
      
    }
    return -1;
    }
  
    public static void main(String[] args) {
        int arr[] = new int[]{20,5,7,23};

        int result = search(arr,4,7);
        System.err.println(result);
       
    }
}