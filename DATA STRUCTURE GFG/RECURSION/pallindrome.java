public class pallindrome {
    public static boolean isPall(String str, int start, int end)
    {
        if(start>=end)
        return true;
        return(str.charAt(start) == str.charAt(end) && isPall(str, start+1, end-1));
    }
    public static void main(String[] args) {
        boolean result = isPall(str, start, end)
    }
    
}
