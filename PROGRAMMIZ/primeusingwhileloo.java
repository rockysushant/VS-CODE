public class primeusingwhileloo {
    
    public static void main(String[] args) {
        int num = 33, i = 2;
        while(i<=num/2 ){
            if(num%i==0){
                flag = true;
                break;

            }
            ++i;
        }
        if(! flag)
        System.out.println(num +"is a prime");
        else
        System.out.println(num + " is not a prime");
    }
}
