public class TilingProblem {
    

    public static int tile(int n){

        if(n==0 || n==1){
            return 1;                                        // yha - kr rhe hai toh minus mein anaswe aa eha hai
            
        }

        int length  = tile(n-1);
        int breadth  = tile(n-2);
 
        int total = length+breadth;

        return total;

    }

    public static void main(String[] args) {
        System.out.println(tile(3));
        
    }
}
