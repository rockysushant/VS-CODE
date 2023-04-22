// import java.util.Arrays;

public class stringtobyte {
    public static void main(String[] args)  {
        byte[] bytes = "Geeksforgeeks".getBytes();
        System.out.println(Arrays.toString(bytes));
        String string = new String(bytes);
        System.out.println(string);
        
    }
    
}
