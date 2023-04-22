public class reverseanoandpallidrome {

    static int reversedNumber(int n){
        int reversed_n = 0;
        while(n>0){
            reversed_n = reversed_n*10+n%10;
            n = n/10;
        }
        return reversed_n;
    }
    public static void main(String[] args) {
        int n  = 123454321;
        int reverseN = revereNumber(n)
        System.out.println("reverse of n =" reverseN);
        if(n == reverseN)
        System.out.println("pallindrome + yes");
        else
        System.out.println("pallindrome + mo");

    }
    
}
