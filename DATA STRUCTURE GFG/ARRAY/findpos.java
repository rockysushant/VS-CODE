package ARRAY;

public class findpos {
    public static int findpos(int arr[],int n, int x)
    {
        for(int i = 0; i<n; i++)
        if(arr[i] == x)
        return i;
        return -1;
    }
    public static void main(String[] args) {
        int result = findpos[20,5,7,25];
        System.err.println(result);
    }
    
}
