import java.lang.annotation.Retention;

public class tailrecursion {
    public static void fact(int n)
    {
        if(n ==0 ||  n ==1)
        return 1;
        return n*fact(n-1);


    }
    public static void main(String[] args) {
        fact(4);
    }
    
}
