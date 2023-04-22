public  class flippedpyramid {
    public static void  flippedPyramidStar(int k){

    
        int a,b;
        for(a = 0; a<k; a++){
            for(b = 0; b<=a; b++){
                System.out.print("5");  
            }
            System.out.println();                   //            *
                                                         //          * *
        }  //                                                      * * * 
        
        
    }



public static void main(String[] args) {
    int k = 5;
    flippedPyramidStar(k);
}
}
