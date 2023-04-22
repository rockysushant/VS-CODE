public class poweroftwo {
    public static boolean isPower(int n)
    {
        // if(n == 0)
        // return false;
        // while(n!= 1)
        // {
        //     if(n%2!= 0)
        //     return false;
        //     n=n/2;
        // }
        // return true;

        if(n == 0)
        return false;
        else // isko lagao ya na lago answer same aayaega ya nhi?
        return((n&(n-1))==0);

    }
    public static void main(String[] args) {
        boolean result = isPower(4);
        System.out.println(result);

    }
}
