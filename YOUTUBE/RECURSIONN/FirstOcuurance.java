public class FirstOcuurance {
    

    
    public static int first(int arr[],int key, int i ){

        if(i==arr.length){
            return -1;

        }

        if(arr[i] == key){
            return i;

        }

        return  first(arr, key, i+1);



    }
    public static void main(String[] args) {
        int arr[] = { 1,3,52,62,4,6,7,9,3,10};
        System.out.println(first(arr, 6, 0));


    }
}
