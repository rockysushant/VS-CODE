
public class firstandlast {
    

    public static String remove(String str){
        str =str.substring(0,str.length()-1);
        return str;
    }
    public static void main(String[] args) {
        String str  = "GeeksforGeeks";

        System.out.println(remove(str));
    }
}
