public class passing2dasargument {
    
    public static int arrF(int arr[][])
    {
        for(int i = 0; i<arr.length; i++){


             for(int j = 0 ; j<arr[i].length; j++);

             System.err.println(arr[i][j] + "");
        }

    }
    public static void main(String[] args) {
        int arr[] [] = {{1,2,3},{4,5,6}};
        System.err.println(arr);
    }
}


// op is 123456
