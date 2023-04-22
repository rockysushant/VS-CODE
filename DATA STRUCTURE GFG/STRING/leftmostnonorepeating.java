
public class leftmostnonorepeating {

    public static int leftMost(String str)
    {
        for(int i = 0; i<str.length(); i++)
        {
            boolean flag = false;           
            for(int j = 0; j<str.length(); j++){
                if(i!= j && str.charAt(i) == str.charAt(j))
                {
                    flag = true;
                    break;
                    
                }
            }
            if(flag == false)
            return i;
        }
        return -10;
    }



public static void main(String[] args) {
    
    System.out.println(leftMost("geeksforgeeks"));         
}
}         










// /linear approach 
//   static final int CHAR = 256;
//   public static int nonRep(String str)
//   {
//     int [] count = new int[CHAR];

//     for(int i =0; i<str.length(); i++)
//     count[str.charAt(i)]++;
    
//     for(int i =0; i<str.length(); i++)
//     count[str.charAt(i)]++;
    
    
//   }