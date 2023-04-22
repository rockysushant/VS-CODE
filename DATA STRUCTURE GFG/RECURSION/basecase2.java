public class basecase2 {
    // public static void fun(int n)
    // {
    //     if(n == 0)
    //     return;
    //     System.err.println(n); // isme 123 kyu nhi print hua
    //     fun(n-1);
    //     System.err.println(n);
    // }


    public static void fun(int n)
    {
        if(n ==0)
        return;
        fun(n-1);
        System.err.println(n);
        fun(n-1);

    }

    public static void main(String[] args) {
        fun(3);
    }
    
}
