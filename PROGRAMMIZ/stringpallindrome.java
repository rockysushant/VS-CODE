





import javax.naming.spi.ResolveResult;

public class stringpallindrome {
    
    public static void main(String[] args) {
        System.out.println("is aaa pallidrome?"+isapallindromeString("aaa"));
    }
    public static boolean isapallindromeString(String text){
        String reverse = reverse(text);
        if(text.equals(reverse)){
            return true;
        }
        return false;
    }
    public static String reve(String input){
        if(input == null)
    }
}
