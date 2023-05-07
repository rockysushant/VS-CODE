
public class LineraSearch {

    public static int search(int number[], int key){
        for(int i = 0; i<number.length; i++){
            if(number[i] == key){
                return i;
            }
        }
        return 0;
    }
    

    public static void main(String[] args) {
        int number[] = {1,2,32,64,3,8,43,9};
        

        System.out.println(search(number, 3));
        

    }

}
