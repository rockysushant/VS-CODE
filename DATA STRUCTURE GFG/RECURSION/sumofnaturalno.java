public class sumofnaturalno {
    public static int getSum(int n)
    {
        if(n == 0)   // put 1 insteadof 0
        return 0;
        return n +getSum(n-1);

    }
    public static void main(String[] args) {
        // int n = 4;
        // System.out.println(getSum(2));

        int result = getSum(3);
        System.out.println(result);
    }

    // TIME COMPLEXITY = 0(N)
    // RECURSIVE TIME COMPLEXITY = T(N) = T(N-1) +0(N)
    
}
