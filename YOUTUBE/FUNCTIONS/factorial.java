public class factorial {
    

    // FACTORIAL

    static int fact(int n){
        int f = 1;

        for(int i = 1;i<=n; i++){
             f = f*i;
            

        }
        return f;
    }


    // BINOMILA COFFECENT

    // FORMULA IS - N(FACT)/ R(FACT)*(N-R)(FACT);


    public static int binCoff(int n, int r){

        int fact_n = fact(n);
        int fact_r = fact(r);
        int fact_nmr = fact(n-r);

        int binCoff = fact_n/(fact_r*fact_nmr);
        return binCoff;




    }




    public static void main(String[] args) {
        // int n  = 4;
        // System.out.println(fact(n));

      System.out.println(  binCoff(5, 2));

    }
}
