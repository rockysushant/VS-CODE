public class a1 {
    public static boolean search(int arr[], int n, int x)
    {
        for(int i = 0; i<n; i++){
            if(arr[i] == x)
                return String.valueOf(i);
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {20,5,7,25};
        int x = 25;
        String result = search(arr, arr.length, x);
        if(result.equals("-1")){
            System.out.println("not found");
        }else{
            System.out.println("FOund");
        }
       
    }
    
}
