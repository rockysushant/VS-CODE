public class LastOccurance {
    
   public static int Last(int arr [], int key, int i){
    if( i == arr.length){
        return -1;

    }

    int found = Last(arr, key, i+1);
    if(found == -1 && arr[i] == key){
        return -1;

    }

    return found;

   }


    public static void main(String[] args) {
        int arr[] = {1,2,53,2,7,5,7,32,4,6};
        System.out.println(Last(arr, 7, 0));

    }
}
