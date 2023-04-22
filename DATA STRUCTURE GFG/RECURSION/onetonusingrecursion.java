public class onetonusingrecursion {
    public static void print(int n)
    {
        if(n ==0)
        return;
        print(n-1);
        System.out.println( n + "");
        
    }
    public static void main(String[] args) {
        int n = 4;
        print(n);
    }

    // TIME COMPLEXITY = 0(N)
    // RECURSIVE TIME COMPLEXITY = T(N) = T(N-1) +0(1)
    // AUXILLARY SPACE = O(N)
    
}
