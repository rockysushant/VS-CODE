public class isPrime {
    
    // public static boolean prime(int n){
    //     for(int i = 2;i<=n-1; i++){
    //         if(n%2 == 0)
    //         return false;
    //     }
    //     return true;
    // }


    public static boolean prime(int n){
        boolean prime = true;

        for(int i = 2;i<=n-1; i++){
            if(n%2 == 0){
            prime = true;
            break;
            }
        }
        return prime;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(prime(n));
    }
}
