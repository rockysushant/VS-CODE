public class sumofdigits {
    public static int getSum(int n){

        
        // if(n == 0)
        // return 0;
        // else
        // return getSum(n/10) + n%10;


        // optimized way

        // int res = 0;
        // while(n>=0)
        // {
            // res = res+n%10;    not working
        //     n = n/10;

        // }
        // return res;


         // TIME COMPLEXITY - 0(N)
         // AUXILALRY SPACE - 0(1)   iska aux yeh kyu.



    }
    public static void main(String[] args) {
        int result = getSum(123);
        System.err.println(result);
        // getSum(123); yeh kyu nhi use ho skta hai

    }

    // TIME COMPLEXITY - 0(N)
    // AUXILALRY SPACE - 0(D)
    
}
