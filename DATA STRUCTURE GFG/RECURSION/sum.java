import java.util.Scanner;
public class sum {
    public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       System.out.println("Enter the desired Number: ");
    //    int userNumber = in.nextInt();
    //    // To convert int to String = 2 ===> String.valueOf(2)
    //    // To convert String to int ====> Integer.parseInt("2") 
    //    String newNumber = String.valueOf(userNumber);
    //    String[] newNumberArray = newNumber.split("");
    //    //"123" "1,2,3" "1.2.3" "1@2@3"
    //    int sumDigit = 0;
    //    for(int i=0; i < newNumberArray.length; i++){
    //         int a = Integer.parseInt(newNumberArray[i]);
    //         sumDigit = sumDigit + a;
    //    }
    //    System.out.println("The sum of digit of number is : " + sumDigit);

        int number = 123;
        int sum = 0;
        while(number > 0){
            int x = number % 10;
            sum = sum + x;
            number = number / 10;
        }
        System.out.println(sum);



    }
    
}
