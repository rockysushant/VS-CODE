public class SumOfNatural {
    


    public static int sumOf(int n){


        if(n==1){
            return 1;

        }


        // int sum = sumOf(n-1);
        // int finaly = n+sum;
        // return finaly;

        //OR


        return n+sumOf(n-1);

    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumOf(n));

    }
}
