import java.io.*;
import java.util.Scanner;
import java.util.*;
import java.util.regex.*;
public class validUsernameRegex {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            String str = sc.next();
            boolean a = Pattern.matches("[a-zA-Z0-9_]{8,30}", str);
            if (a) {
                if (str.charAt(0)=='1' || str.charAt(0)=='2' || str.charAt(0)=='3' || str.charAt(0)=='4' || str.charAt(0)=='5' || str.charAt(0)=='6' || str.charAt(0)=='7' || str.charAt(0)=='8' || str.charAt(0)=='9' || str.charAt(0)=='0' || str.charAt(0)=='_') {
                    System.out.println("Invalid");
                } else {
                    System.out.println("Valid");
                }
            } else {
                System.out.println("Invalid");
            }
            n--;
        }
    }
    
}
