public class snakepatetrn {
    

    public static void print(int arr[] []){

        int r = 0;
        int c = 0;
        for(int i = 0; i<r; i++){
            if(i%2==0){
                for(int i = 0; j<c; j++){
                    System.out.println(mat[i][j]+ "");
                }else{
                    for(int j =<-1; j>=i; j--){
                        System.out.println(mat[i][j]+ "");
                    }
                }
            }

        }
    }


    public static void main(String[] args) {
        int arr [] [] = {{1,2,3,4},{5,6,7,8},{9,10,11,12,},{13,14,15,16}};

        print(arr);
    }
}
