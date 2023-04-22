public class exception {
    
    public static void main(String[] args) {
        int a = 6;
        int b = 0;

        // System.err.println(a/b);

        try{
            System.err.println(a/b);
        }
        catch(ArithmeticException e){
            System.err.println("divided by zero operator cant possible");
        }



    }
}
