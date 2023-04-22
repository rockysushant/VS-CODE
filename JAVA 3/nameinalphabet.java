public class nameinalphabet {
    public static void main(String[] args) {
        int n = 4;
        String names = {"rahul", "aryan", "gaurav", "riya"};
        String temp;
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(names[i].comapreTo(names[j])>0){
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;

                }
            }
        }
        System.out.println("the names in alphabetic order are");
        for(int i =0; i<n; i++){
            System.out.println(names[i]);
        }
    }
    
}
