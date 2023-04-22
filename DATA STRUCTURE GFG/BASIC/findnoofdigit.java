package BASIC;
// using iterative method 

public class findnoofdigit {
    
    public static int countDigit(int n)
    {
        int count =0;
        while(n!= 0){
            n = n/10;
            count++;


        }
        return count;



        // 2 recusrsiv mrthod

        // if(n == 0)
        // return 0;

        // return 1 + countDigit(n/10);



        // 3 using logarithmic

        // return flour(log10(n)+1);
    }
    public static void main(String[] args) {
       int result = countDigit(100);
       System.out.println("the value is : "+ result);
    }
 
}
