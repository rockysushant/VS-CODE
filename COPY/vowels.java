import java.util.Scanner;


public class vowels {
    
   
    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        
        // String str = sc.nextLine();
        String str = "geeksforgeeks";
        str  = str.toLowerCase();

        char[] chars = str.toCharArray();
        int count = 0;
        for(int i= 0; i<str.length(); i++){
            if(str.charAt(i)=='a' || str.charAt(i) == 'e' || str.charAt(i) =='i' || str.charAt(i) =='o' || str.charAt(i) == 'u'){
                count++;
                System.out.println(str.charAt(i));
            }
        }
        
        System.out.println( "The count is = " + count);
        System.out.println();  
    }
}
