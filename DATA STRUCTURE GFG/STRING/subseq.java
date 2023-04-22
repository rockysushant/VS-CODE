
public class subseq {
    
    public static  boolean isSub(String s1, String s2, int n, int m)  
    {
        
        int j = 0;
        for(int i = 0; i<n && j<m; i++)
        {
            if(s1.charAt(i)== s2.charAt(j))
            j++;

        }
        return (j == m);

    }
    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "AE";
       System.out.println(isSub(s1, s2, 4, 2));
        // System.err.println(isSub(ABCD, AD, n, m));
    }
    }

