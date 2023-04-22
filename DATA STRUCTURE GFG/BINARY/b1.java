// package DATA STRUCTURE GFG.BINARY;

public class b1 {
    public static int binarySe(int arr[], int x , int n)     // int n kya hai 
    {

        // int n = arr.lenght();

        int low = 0,  high = n-1;
        while(low <= high){

        if(arr[mid] == x )
        return mid;
        
        else if( arr[mid] < x)
        high = mid+1;

        else
                                        //  yha pe low = mid -1 na likeh toh chalega;
        low = mid-1;

    }
    return -1;
}

    




public static void main(String[] args) {
    int arr[]  = {5,10,15,25,35};
    int result = binarySe(arr, 15, n);
    System.out.println(result);
}
}

