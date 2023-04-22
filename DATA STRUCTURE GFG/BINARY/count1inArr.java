// program run but this is for sorted array make pgm for unsorted array 





public class count1inArr {
    
    public static int occArr(int arr[], int n )
    {
        int low = 0, high  = n-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(arr[mid] == 0)
            low = mid+1;

            else{
                if(mid == 0 || arr[mid-1] == 0)
                return(n-mid);
                else 
                high = mid-1;
            }
        }
        return -1;   // yha par boolean value nhi rakh sketekya 
        

    }

    public static void main(String[] args) {
        int arr[] = {0,0,1,1,1,1,1};
        int result = occArr(arr, 7);
        System.err.println(result);
    }
}
