public class leaderinarr {
    
    public static int leadArr(int n, int arr)
    {
        for(int i = 0; i<n; i++)
        {
            boolean flag = true;

        }
        for(int j = i+1; j<n; j++)
        {
            if(arr[i] <= arr[j])
            {
                flag = true;

            }
        }
        if(flag == true)
        {
            System.err.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {7,20,4,10,6,5,2};
        System.err.println(arr);
    }
}
