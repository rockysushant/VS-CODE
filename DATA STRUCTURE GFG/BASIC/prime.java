public class prime {
    
    public static boolean isPrime(int n)

    {
        if(n == 1)
        return false;
        for(int i = 2; i<n; i++)
        if(n%i== 0)    // divide ke saath == saath mein kyu
        return false;           // elsw laga rha hoon tooh 
        return true;
    }

    // 2 method 

        // if(n == 1)return false;                                              
        // for(int i = 2; i*i<=n; i++)
        // if(n%i== 0)
        // return false;
        // return true;
        // 
    // }

    public static void main(String[] args) {
        boolean result = isPrime(5);
        System.out.println(result);

        // isPrime(6);                // this is also not working
        
    }
}

    
//  time complexty is = 0(n)
