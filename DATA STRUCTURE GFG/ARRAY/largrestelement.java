// package ARRAY;

public class largrestelement {

    // public static int getlar(int arr[])
    // {
    //     int n = arr.length();
    //     for(int i = 0; i<n; i++)
    //     {
//             if(arr[i]<arr[j])
//             {
//                 flag = false;
//                 break;
//             }

//         }
//         if(flag == true)
//         return i;

//     }
//     return -1;




// public static void main(String[] args) {
//     int arr[] = {1,2,3,4,5};
//     System.err.println(getlar(arr));
// }
// }

//  T.C = O(n^2)

// effic way



    public static int getlar(int arr[]){
        int res = 0;
        for(int i = 1; i<arr.length; i++);
        if(arr[i] > arr[j]);
        res = i;
        return res;
    }

    public static void main(String[] args) {
    int arr[] = {1,2,3,4,5};
    System.err.println(getlar(arr));
}
