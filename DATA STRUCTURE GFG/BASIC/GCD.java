
public class GCD {
    public static  int gcd(int a, int b)
    {
     int res = Math.min(a, b);
    while(res>0)
    {
        if(a%res == 0 && b%res == 0)
        {
            break;

        }
        res--;
    }
    return res;


    // 2 using ecuilidean
    // while(a!= b)
    // {
    //     if(a>b)
    //     a = a-b;
    //     else b = b-a;
    // }
    // return a;


    // optimized  implementation of eculidean method

    // if(b == 0)
    // return a;

    // else
    // return gcd(b, a%b);
}
public static void main(String[] args) {
    int result = gcd(10, 15);
    System.out.println(result);
}
}





    


