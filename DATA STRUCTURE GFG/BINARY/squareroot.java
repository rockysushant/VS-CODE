public class squareroot {
    
    public static int rootJ(int x)
    {
         int i = 1;
         while(i*i <=x)
         i++;
         return(i-1);
    }
    public static void main(String[] args) {
        int  x = 9;
        int result = rootJ(x);
        System.err.println(result);
    }
}
