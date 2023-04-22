
public class pallidrome {
    public static boolean isPallindrome(int n)
    {
        int rev = 0;
        int temp = n;

        while(temp!= 0){
            int ld = temp%10;
            rev = rev*10+ld;
            temp = temp/10;
        }

        return(rev == n);


    }
    public static void main(String[] args) {
        boolean result = isPallindrome(52245);                   // returns true only
        System.out.println(" the output is " +  result);


        // isPallindrome(5332);
    }
    
}


// time complexity  = 0(d)   d is the no of digit in input no.