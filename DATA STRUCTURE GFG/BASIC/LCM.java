
public class LCM {
    public static  int lcm(int a, int b)
    {
     int res = Math.max(a, b);
    while(true)
    {
        if(res%a == 0 && res%b == 0)
        return res;
        res++;
    }
   
    
}
public static void main(String[] args) {
    // int result = lcm(4, 6);
    // System.out.println(result);

    
    System.out.println(lcm(4, 6)); 
}
}


// time complexity is = 0(a*b)
