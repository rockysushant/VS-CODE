
public class basecase3 {
    public static int fun(int n){
    if(n == 1)
    return 0;
    else
    return 1 + fun(n/2);
    }
    public static void main(String[] args) { // op is 4
        fun(16);
    }
    
}
