
public class reversearr {
    
    public static int revArr(int arr[], int n)
    {
        int low = 0 , high = n-1;
        while(low<high)
        {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;

        }
    }




    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(revArr(arr, 2));
    }
}



