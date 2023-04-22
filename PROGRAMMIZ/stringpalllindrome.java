public class stringpalllindrome {
    
    public static void main(String[] args) {
        System.out.println("is aaa pallindrome" + isaPllindromeString("aaa"));
    }
    public static boolean isaPllindromeString(StirngText){
        String reverse = reverse(text);
        if(text.equals(reverse)){
            return true;
        }
        return false;
    }
    public  static String reverse(String input) {
        if(input == null || input.isEmpty())
        return input;

        
    }
    return input.charAt(input.length() -1) + reverse(input.subString(0,input.length()-1));
}
