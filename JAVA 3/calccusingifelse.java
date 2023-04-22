import java.util.Scanner;


public class calccusingifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first and the second number");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Enter the oprator you want to perform(+,-,*,/)");
        char op = sc.next(charAt(0));
        solve(a,b,op);

          public static int solve(int a, int b, char op) {
            int ans = 0;
            if(op =='+'){
                ans = a+b;

            }
            else if(op =='-'){
                ans = a-b;
                
            }
           else  if(op =='*'){
                ans = a*b;
                
            }
            else if(op =='/'){
                ans = a/b;
                
            }
            System.out.println("your answer is"+ans);
            return ans;
            
            
        }

        
    }
