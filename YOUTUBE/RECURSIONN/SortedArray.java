public class SortedArray {
    

    public static boolean fun(int arr[], int i){

        if(i == arr.length-1){
            return true;

        }

        if(arr[i]>arr[i+1]){
            return false;


        }

        // int total = fun(arr, i+1);
        // return total;



       return fun(arr,i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,22,3,4,5};
        System.out.println(fun(arr, 0));

    }
}
