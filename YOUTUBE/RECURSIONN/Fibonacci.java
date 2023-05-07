public class Fibonacci {
    
    public static int fib(int n){

        if(n==0 || n==1){
            return n;

        }
        int first = fib(n-1);
        int second = fib(n-2);
        int total = first+second;
        return total;


    }


    public static void main(String[] args) {
        int n = 1000;
        System.out.println(fib(n));

    }
}
