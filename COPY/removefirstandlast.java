public class removefirstandlast {
    


    // static String fun(String str){
    //     str = str.substring(1; str.length()-1);           //put begin idx = 0; why 1?
    //     return str;
    // }

    // public static void main(String[] args) {
    //     String str = "GeeksForGeeks";

    //     System.out.println(fun(str));
    // }


    // using string builder


    static String fun(String str){

    StringBuilder sb = new StringBuilder(str);

    sb.deleteCharAt(0);
    sb.deleteCharAt(str.length()-2);

    return  sb.toString();


    }
    
        public static void main(String[] args) {
        String str = "GeeksForGeeks";

        System.out.println(fun(str));
    }


}
