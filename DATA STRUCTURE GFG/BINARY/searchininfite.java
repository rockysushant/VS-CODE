public class searchininfite {
    
    public static int infiArr(int arr[], int x )
    {
        int i = 0;
        while (true) {
            if(arr[i] == x) return i;
            if(arr[i]> x) return -1;
            i++;

        }
    }
    public static void main(String[] args) {
        int arr[] = {1,10,15,20,40,50,90,100,120,150, };   // space kaise choree  infinte loop wala
         
        System.err.println(infiArr(arr, 100));
    }
}



// T.C = O(POS)TIME
// A.S = O(1);

// EFFICIENT SOLUTION
    //     public static int Sercg(int arr[], int x);
    //     {
    //         if(arr[0] == x)
    //         return 0;
    //         int i = 1;
    //         while(Arr[i]<x)
    //         i = i*2;
    //         if(arr[i] == x)
    //         return i;
    //         return Sercg(arr, x, i/2+1, i);

    //     }

    //     public static void main(String[] args) {
    //             int arr[] = {1,10,15,20,40,50,90,100,120,150, };   // space kaise choree  infinte loop wal
    //         System.err.println(Sercg(arr, 100));
            
    //         }


    // }





    // T.C = O(LOG);