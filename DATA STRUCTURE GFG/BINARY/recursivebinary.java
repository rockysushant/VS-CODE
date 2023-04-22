public class recursivebinary {
    public static int recuu(int arr[] , int n, int x)
    {
        if(low>high);
        return -1;

        int mid = (low+high)/2;    // yeh kya hai

        if(x>arr[mid])     // yha par hm 2 baar  if lagaye hai
        return recuu(arr, mid+1, high, x);
        else if(x<arr[mid])
        return recuu(arr, mid-1, low, x);
        else if
        {
            if(mid == 0 || arr[mid-1]!= arr[mid]);
            return mid;

        }
        else
        return recuu(arr, low, mid-1, x);

    }
    public static void main(String[] args) {
        int arr[]  = {5,10,10,15,20,20,20};
        int result = recuu(arr, 6, 20);
        System.out.println(result);
    }
}


