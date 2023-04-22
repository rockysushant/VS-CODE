public class generatesubset {
    public static void Subset(String s, String curr, int i = 0;)
    {
        if(i == s.length())
        System.err.println(curr);
        return;
    }
    Subset(s, curr, i++);
    Subset(s,  curr+s[i], i+1);
    
}
