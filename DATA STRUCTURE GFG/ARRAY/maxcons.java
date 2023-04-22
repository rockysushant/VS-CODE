
public class maxcons{
    
    public static int countOne(int arr[])
    {
        int count = 0;
        int n = arr.length;

        for(int i = 0; i<n; i++){
            int curr = 0;
            for(int j; j<n; j++)
            {
                if(arr[i] == arr[j])
                curr++;
                else break;

            }
            res = Math.max(curr, res);  // yeh kya hai

        }
        return res;
    }


    // {
    //     int count = 0, curr = 0;
    //     int n = arr.length;
    //     for(int i = 0; i<n; i++)

    //     {
    //         if(arr[i] == 0)
    //         curr = 0;
    //         else{
    //             curr++;
    //         }
    //         res = Math.max(res, curr);
    //     }
    //     return res;
    // }

    public static void main(String[] args) {
        int arr[] = {0,1,1,0,1,0};
        System.err.println(countOne(arr));
    }
}
