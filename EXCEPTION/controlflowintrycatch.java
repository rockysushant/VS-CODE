public class controlflowintrycatch {
    
    public static void main(String[] args) {
        int[] arr = new int[4];
        
        try{
            int i = arr[4];
            System.out.println("inside try block");
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("exception caught in catch block");
        }
        System.out.println("outsidetry catch clsuse");
    }
}
