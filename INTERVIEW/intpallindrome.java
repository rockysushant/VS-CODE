public class intpallindrome {
    
    public static void main(String[] args) {
        System.out.println("please enter a nmuber");
        int pallindrome = new Scanner(System.in).nextInt();
        if(isPallindrome(pallindrome)){
            System.out.println("number" + pallindrome+ "is a pallindrome");
        }
        else{
            System.out.println("Number"+pallindrome+"is not  a pallindrome");
        }
    }
}
