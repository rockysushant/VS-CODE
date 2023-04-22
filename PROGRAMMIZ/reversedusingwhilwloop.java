public class reversedusingwhilwloop {
    
    public static void main(String[] args) {
        int num = 1234, reversed = 0;
        while(num ! = 0)
        {
            int digit = num % 10;
            reversed = reversed * 10 + digit;  // spaces woekd or not
            num / =  10;
            System.out.println("reversed number" + reversed);
        }
    }
    }
}
