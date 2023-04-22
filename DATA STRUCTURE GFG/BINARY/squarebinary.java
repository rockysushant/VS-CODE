// import javax.lang.model.util.ElementScanner14;

public class squarebinary {
    
    public static int sqrRoot(int x)
    {
        int low = 1, high = x, ans = -1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            int msqr = mid*mid;
            if(msqr == x)
            return mid;
            else if(msqr >x)
            high = mid-1;
            else{
                low = mid+1;
                ans = mid;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        // int n = 9;
        // int result = sqrRoot(n);     // in teeno ke wajah ek koi likh sket ahi kya?  or isko kya kahenge
        // System.err.println(result);


        // int n = sqrRoot(64);
        // System.err.println(n);

        System.err.println(sqrRoot(64));
    }
}
