public class indexoffrstoccur {
    
    public static int firstOcuur(int arr[], int n, int x)
    {
       for(int i = 0; i<n; i++)
       if(arr[i] == x)
       return i;
    }
    public static void main(String[] args) {
        int arr[] = { 5,10,10,15,15};
        int result = firstOcuur(arr, n, 15);
        System.out.println(result);
    }
}
