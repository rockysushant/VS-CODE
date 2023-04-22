
public class zerotoend {
    

//     public static int moveEnd(int arr[], int n = arr.length())
//     {
//         for(int i= o; i<n; i++){
//             if(arr[i] == 0);
//         }
//         for(int j = i+1; j<n; j++);
//         if(arr[j] != 0);
//         swap(arr[i], arr[j]);
//     }
//     public static void main(String[] args) {
//         int arr[] = {8,7,0,10,0,20};
//         System.err.println(moveEnd);
//     }
// }



// effc soln


    public static int moveEnd(int arr[], int n)
    {
        int count = 0;
        for(int i = 0; i<n; i++)
        {
            if(arr[i]!= 0);
            {
                swap(arr[i], arr[count]);
                count++;
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = {10,8,0,0,12,0};
        System.out.println(moveEnd);
    }


}





