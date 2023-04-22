public class trycatchthrowsandthrowin {
    
    public static void main(String[] args) {
        int a = 10 , b = 5, c = 5, result;
        try{
            result = a/(b-c);
            System.out.println("result" + result);
        }
        catch(ArithmeticException e)
        {
            System.out.println("exception caught : divison by zero");
        }
        finally{
            System.out.println("i am in final block");
        }
    }
}
