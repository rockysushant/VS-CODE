public class Arithmeticexception {
    public static void main(String[] args) {
        try{
            int a = 30, b= 0;  
            int c = a/b;
            System.out.println("result" +c);
        }
        catch(ArithmeticException e) {
            System.out.println("cant divide a number by 0");
     }
    }
}