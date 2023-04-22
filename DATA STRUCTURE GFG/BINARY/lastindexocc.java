public class lastindexocc {
    
    public static int lastOcc(int arr[], int n, int x, int low, int high)   // isme high, low lo ya bahar kya farq padta hai
    {
        if(low>high)
        return -1;

        int mid = (low+high)/2;

        if(arr[mid]> x)
        return lastOcc(arr, n, low, mid-1);
        else if(arr[mid] < x)
        return lastOcc(arr,, mid+1, high, n);
        else
        {
            if(mid == n-1 || arr[mid]! = arr[mid+1])
            return mid;
        }
        else
        return lastOcc(arr, mid+1,n, high);


    }
}
