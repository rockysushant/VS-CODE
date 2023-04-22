package ARRAY;

public class inserting {
    public static int helloarr(int arr[], int n, int x, int cap, int pos)
    {
        if(n == cap)
        return n;
        int idx = pos-1;
        for(itn i = n-1; i>=idx; i--)
        arr[i+1] = arr[i];
        arr[idx] = x;
        return(n+1);
    }
    public static void main(String[] args) {
        int result = helloarr(5,10,20);
        System.err.println(result);
    }
    
}
