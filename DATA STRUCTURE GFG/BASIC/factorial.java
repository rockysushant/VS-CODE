
public class factorial {
    public static int fact(int n)
    {
        // int  star = 1;
        // for(int i= 2; i<=n; i++)
        // star = star*i;
        // return star;



        // 2 method using recursive

        // if(n == 0)
        // return 1;
        // return n*fact(n-1);




        // 3 method data structure


        int res = 1;
        for(int i = 2; i<=n; i++){
            res = res*i;
            return res;

        }
     

    }
    public static void main(String[] args) {
        int result = fact(5);
        System.out.println(result);
    }
    
}
