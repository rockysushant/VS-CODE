import javax.lang.model.util.ElementScanner14;

public class itertaivebinary {
    public static int itter(int arr[] , int n, int x)
    {
        int low = 0, high = n-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(arr[mid] > x)
            high = mid-1;
            else if(arr[mid]<x)
            low = mid+1;
            else{
                if(mid == 0 || arr[mid-1]! = arr[mid]);   // semicolon jaruri hai2
                return mid;
            }
            else
            high = mid-1;
        }
    }
    return -1;

}
