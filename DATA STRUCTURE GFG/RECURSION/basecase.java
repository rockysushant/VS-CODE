public class basecase {
    public static void fun(int n)
    {
        if(n ==0)
        return ;  // yha pe return 0 ya 1 kyu nhi laga'   aur yha return 1 laga de toh kya hoga
        System.out.println("gfg");
        fun(n-1);
    }
    public static void main(String[] args) {
        fun(2);
    }
    
}
