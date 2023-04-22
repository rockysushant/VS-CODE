public class noofdigitinastring {
    
    public static void main(String[] args) {
        String str = "geeksforgeeks pass is :1234";
        int digit = 0;
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i)>=48 && str.charAt(i)<=57) // yeh kya hai     48 = 0 , 57 = 9 
            {
                digit++;
                System.out.print(str.charAt(i));
            }
           
        }
        System.out.println();
        System.out.print(digit);
        
    }
}
