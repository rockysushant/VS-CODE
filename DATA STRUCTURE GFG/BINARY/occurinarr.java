public class occurinarr {
    
    public static int occ(int arr[], int n, int x)
    {
        // int first = 0 , last = 0;
        int first = firstOccu(arr, n ,x);
        if(first == -1)
        return 0;
        else
        return(lastOccu(arr,n,x)-first=1);


    }
}
