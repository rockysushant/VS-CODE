
public class sorted {
//     public static boolean isSorted(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i+1; j < arr.length; j++) {
//                 if (arr[j] < arr[i])   // change i j and true false then 1 to 10 thrn op is true why?
//                     return false;
//             }
            
//         }
//         return true;
//     }
    

// public static void main(String[] args) {
//    int arr[] = {1,2,3,4};
   
//     System.out.println(isSorted(arr));
// }
// }

// T.C = o(n^2)



//  effc soln

public static boolean isSorted(int arr[]){
    for(int i= 0; i<arr.length; i++)
    if(arr[i] < arr[i-1])
    return false;
    return true;
}


public static void main(String[] args) {
       int arr[] = {1,2,3,4};
       
        System.out.println(isSorted(arr));
    }

}



//  T.C =  O(n)
    

