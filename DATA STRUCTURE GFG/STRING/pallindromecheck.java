public class pallindromecheck {
    


    static  boolean  fun(String str){
        StringBuilder sb = new StringBuilder();
        sb.reverse(str);
        return str.equals(sb.toString());

    }
    public static void main(String[] args) {
        String str = "ABAB";
        System.out.println(fun(str));
        // fun(str);
        
    }

    
}
