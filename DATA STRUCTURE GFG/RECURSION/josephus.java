public class josephus {
    public static int jos(int n, int k)
    {
        if(n == 1)
        return 0;
        else
        return(jos(n-1, k)+k)%n;
    }
    public static void main(String[] args) {
        System.err.println(jos(4, 3));
    }
    
}
