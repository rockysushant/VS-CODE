
public class pairsum {
 
    
    public static boolean fun(int arr1[] ,int arr2[],  int n,int sum){
        // int n = arr.length;

        for(int i = 0; i<n; i++){         // yha pe arr.length kyu nhi liye

            for(int j = i+1; j<n; j++){
                if(arr1[i] + arr2[j] == sum){
                    return true;
                }
               
            }
        }
        return false;
        
    }


    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};

        int arr2[] = {2,4,5,6,8};

        // int sum = 10;
       System.out.println( fun(arr1,arr2, 5, 100));

    }
}
