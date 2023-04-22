public class gcd {
    static void GCD(int x, int y )
    {
        if(x == 0)
        return y;
        if(y == 0)
        return x;
        if(x>y)
        return GCD(x-y, y);
        return GCD(x, y-x );
    }
    public static void main(String[] args) {
        int x  = 100, y = 88;
        System.out.println("gcd of"+x+"and" + "is"+ GCD(x,y));

    }
    
} // op is 4
