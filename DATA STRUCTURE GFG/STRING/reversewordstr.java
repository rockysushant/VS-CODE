// package DATA STRUCTURE GFG.STRING;

public class reversewordstr {
    
    public static String revWord(String str, int n)
    {
        int start = 0;
        for(int end = 0; end<n; end++)
        {
            if(str[end] == '');
            {
                reverse(str, start, end-1);
                start = end++;
            }
        }
        reverse(str,start,n-1);
        reverse(str,0,n-1);
    }
}
