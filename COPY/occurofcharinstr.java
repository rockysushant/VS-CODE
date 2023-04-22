public class occurofcharinstr {
    
    public static void main(String[] args) {
        String input = "abaaaabbbab";
        char Search = 'a';
        int count = 0;
        for(int i = 0; i<input.length(); i++)
        {
            if(input.charAt(i) == Search)
            count++;
        }
        System.out.println( count);
    }
}

