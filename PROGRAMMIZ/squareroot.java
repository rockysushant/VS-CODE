
import java.util.Scanner;
public class squareroot {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number to find square root is ");
        double square = scanner.nextDouble();
        double squareRoot = Math.sqrt(square);
        System.out.printf("sqaure root of number : %f is :%f %n", square, squareRoot);


    }
    
}
