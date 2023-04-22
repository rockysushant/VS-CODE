public class recursivefactorial {
    
    public static int factorial(int n){     // public lagaye toh koi dukat?
        if(n==0){

            return 1;               // if we are ommenting this than infinite .............
            
        }
        return n*factorial(n-1);
    }


    public static void main(String[] args) {
        int n =5;
        System.out.println(factorial(n));    // function call toh without sys hpta hai n?
    
        
    }
}
