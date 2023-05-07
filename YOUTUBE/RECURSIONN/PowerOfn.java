public class PowerOfn {

    public static int fun(int x, int n){

        if(n == 0){
            return 1;
        }

        int power =fun(x, n-1);
        int total = x*power;
        return total;

    }
    public static void main(String[] args) {
        System.out.println(fun(2, 10));
        
    }
}
