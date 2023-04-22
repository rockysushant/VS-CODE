// package DATA STRUCTURE GFG.BASIC;

public class poweroftwo {
    

    // static boolean fun(int n){

    //     if(n==0){
    //         return false;

    //     }
    //     while(n!=1){
    //         if(n%2==0)
    //         return false;
    //         n = n/2;
    //     }
    //     return true;
    // }



    //METHOD 2

    // static boolean fun(int n){
    //     if(n==0)
    //     return false;
    //     return((n&(n-1))==0);
    // }


    // METHOD 3

    static boolean fun(int n){
        return((n!=0)&&((n&(n-1)==0)));

    }


    public static void main(String[] args) {
        int n = 5;
        fun(n);

    }




 



}
