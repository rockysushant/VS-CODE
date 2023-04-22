

public class printfirstandlast {
    

     static void fun(String str){
        char first = str.charAt(0);
        char last = str.charAt(str.length()-1);
        System.out.println("first " + first);
        System.out.println("last " + last);

     }
     
    public static void main(String[] args) {
        String str = "geeksfrogeeke";

        
        fun(str);
    }
}
