public class sumfnatural {
    
//  public static int fun(int n){
//     return n *(n+1)/2;

//  }


    // static int fun(int n){
    //     int sum = 0;
    //     for(int i= 0; i<=n; i++){
    //         for(int j = 0; j<=1; j++){
    //             sum++;
    //             return sum;
    //         }
    //     }
    // }


    int fun(int n){
        int sum = 0;
        for(int i = 0; i<=n; i++){
            sum = sum+i;
            return sum;
        }


    }

    public static void main(String[] args) {
        int n  = 5;
        fun(n);

    }
}
