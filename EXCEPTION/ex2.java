public class ex2 {
    
    public static void main(String[] args) {
        int a = 5, b = 0; 
        try 
        {
            int c = a/b;
            
        }
        catch(ArithmeticException e )
            {
                e.printStackTrace();
            }
    }
}
