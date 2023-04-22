public class towerofhanoi {
    public static void TOH(int n, char A, char B , char C)
    {
        if(n ==1)
        {
            System.err.println("move 1 from " + A + "to" + C);
            return;

        }
        TOH(n-1, A, B, C);
        System.err.println("move"+ n+ "from"+A+"to" +C);
        TOH(n-1, A, B, C);
    
    public static void main(String[] args) {
        System.err.println(TOH(4, 1, 7, 1));
    }
    
}
