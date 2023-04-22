public class recursiveBseach {      // is iterative better than recurive bcz recursive take logn extra space
    
    public static class int recBin(int arr[], int x, int low, int high)
    {
        int mid = (low+high)/2;
        if(arr[mid] == x)return mid;
        else if(arr[mid]>x)
        return recBin(arr, x, low, mid-1);
        else
        return recBin(arr, x, mid+1, high);
    }
}
