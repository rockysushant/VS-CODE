import java.util.Arrays;

public class anagram {

    public static boolean isAna(String str1, String str2 )
    {
        if(str1.length()!= str2.length())
        return false;

        return true;
        

        // char s1[] = s1.toCharArray();
        // Arrays.sort(s1);
        // s1 = new String(s1);


        // char s2[] = s2.toCharArray();
        // Arrays.sort(s2);
        // s2 = new String(s2);

        // return s1.equals(s2)   
    }
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        System.out.println(isAna(s1, s2));

        // System.out.println(isAna("Listen", "silent"));
    }
    
}
