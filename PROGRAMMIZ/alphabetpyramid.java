public class alphabetpyramid {
    
    public static void main(String[] args) {
        char last = 'e' ,alphabet = 'a';
        for(int i = 1;i<=(last-'a'+1); ++i)
        {
            for(int j = 1; j<=i; ++j)
            {
                System.out.print(alphabet +" ");
            }
            ++alphabet;          //change this and then see
            System.out.println();

        }   
    }
}
