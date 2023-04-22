public class r1 {
    public static void fun1()
    {
        System.err.println("fun1 hai yeh");
        
    }
    public static void fun2()
    {
        System.err.println("before fun1");
        fun1();
        System.err.println("after fun1");
        
    }
    public static void main(String[] args) {
        System.err.println("before fun2");
        fun2();
        System.err.println("after fun2");
    }
    
    
}
