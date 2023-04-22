

public class pallidrome {

    public static boolean isPall(String str)
    {
        StringBuilder rev = new StringBuilder(rev);
        rev.reverse();

        return str.equals(rev.toString());
    }




    // efficient soln


    public static boolean isPall(String str)
    {
        int begin = 0;
        int end = str.length()-1;

        while(end>begin){
            if(str.charAt(begin)!= str.charAt(end))
            return false;
            
            else{
            begin++;  
            end--;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        String str = "abayyaba";
        System.err.println(isPall(str));
    }
}



// TC = O(1)  , best case  , 0(n)  worst case
//  AS = O(1)



// boolan mein true fale aa arha hai toh usko yes no krn ahai toh kya krenge




























// public static boolean main(String[] args) {
//     String str = "ababa";

//     StringBuilder rev = new StringBuilder(rev);
//     rev.reverse();
//     return str.equals(rev.toString());




