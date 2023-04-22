

public class findpos {
    public static int findpos(int arr[],int n, int x)
    {
        for(int i = 0; i<n; i++){
            if(arr[i] == x)
            return i;
        }
     
        return -1;
    }
    public static void main(String[] args) {
        int arr[]  = {1,2,3,5,7};
        
        int result = findpos(arr,5,5);

        
        System.err.println(result);
    }
    
}
