
public class getpair {


    static void fun(int number[]){
        for(int i = 0; i<number.length;i++){
            int curr = number[i];
            for(int j = i+1; i<number.length; j++){
                System.out.println("(" + curr +"," + number[j] + ") ");
            }

            System.out.println();
        }
    }


    
    public static void main(String[] args) {
        int number[] = {1,2,32,64,3,8,43,9};
        fun(number);
     
    }
}

