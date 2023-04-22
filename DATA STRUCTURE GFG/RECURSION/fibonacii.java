public class fibonacii {
    public static  int fib(int n){
        if(n == 0)
            return 1;
        return fib(n-1) + fib(n-2);
    }
    
    public static void main(String[] args) {
        int result = fib(3);
        System.out.println(result);
    }
}
