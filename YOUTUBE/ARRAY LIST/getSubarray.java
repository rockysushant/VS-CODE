public class getSubarray {
    

    static void print(int number[]){
        // int total = 0;


        for(int i = 0; i<number.length; i++){
            int start = i;
            for(int j = i; j<number.length; j++){
                int end = j;
                for(int k = start; k<=end; k++){ // print 
                    System.out.print(number[k] + " "); // subarray

                }
                // total++;

                System.out.println();
            }
            System.out.println();
        }

        // System.out.println("total sub is " + total);
    }

    public static void main(String[] args) {
        int number[] = {2,4,6,8,10};
        print(number);

    }
}
