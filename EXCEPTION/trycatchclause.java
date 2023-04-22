public class trycatchclause {
    
    public static void main(String[] args) {
        {
            int[] arr = new int[4];
            try{
                int i =  arr[4];
                
                    System.out.println("inside tr u block");
                }
                catch(ArrayIndexOutOfBoundsException ex)
                {
                    System.out.println("exceptio n has been csaught");
                }
                System.out.println("outside try catch bloxck");
            }
        }
    }

