// package ARRAY;

public class leftrotatebyone {
    public static int[] rotateOne(int arr[] , int n)
    {
        int temp = arr[0];
        for(int i = 1; i<n; i++){

        arr[i-1] = arr[i];
        

    }
    arr[n-1] = temp;
    return arr;

}

public static void main(String[] args) {
    int arr[]  = {1,2,3,4};
    int[] result = rotateOne(arr, arr.length);
    
    for(int i = 0; i<arr.length; i++)  // yeh kya hai
      System.out.print(result[i]);
}
}


