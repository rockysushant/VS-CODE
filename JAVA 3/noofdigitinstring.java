public class noofdigitinstring {
    public static void main(String[] args) {
        String str = "hello123884";
        int digit = 0;
        for(int i= 0;i<str.length();i++){
            // if(str.charAt(i)>=48 && str.charAt(i)<57)
            digit++;

        }
        System.out.println(digit);
    }
    
}
