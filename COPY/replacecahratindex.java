public class replacecahratindex {
    

    public static void main(String[] args) {
         String str = "geeksgorgeeks";
         int idx = 5;
         char ch = 'f';

         System.out.println("The original string is " + str);


         StringBuilder sb = new StringBuilder(str);
         sb.setCharAt(idx, ch);
         System.err.println(sb);
    }
}
