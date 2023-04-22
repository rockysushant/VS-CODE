public class last2digitevenorodd {
    
    public static void main(String[] args) {
        int  number = 12345;
        int lastTwoDigit = number%100;
        int checkOddorEven = lastTwoDigit%2;
        switch(checkOddorEven){
            case 0:
            System.out.println("it is even");
            break;
            case 1:
            System.out.println("it is odd");
            break;
            default:
            System.out.println("nothing found");
            break;
            
        }
    }
}
