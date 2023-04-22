public class exception {
    
    public static void main(String[] args) {
        try{
            int a = 4, b= 0;
            int c = a/b;

        }
        catch(Throwable e)
        {
            System.out.println("exception:" + e.toString());
        }
    }
}
