public class removealphanumeric {
    



    
    public static String remove(String str){
        str = str.replaceAll("[^a-z A-Z 0-9]", "");
        return str;

    }
    public static void main(String[] args) {
        String str = "@!Geeks-for-geeks!@,123";      // up ad down
      
        System.out.println(remove(str));
       
    }




 
}
  