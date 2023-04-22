import java.io.*;
public class squaresum {
    public static void main(String[] args) throws IOException {
        int sum = 0;
        int n = 8;
        for(int i = 0; i<=n; i++){
            sum += (i*i); // why i have used plus in thsi ccase

        }
        System.out.println("the no of term is "+ sum);
        
    }
    
}