public class printsquarestar {
    
    static void print_rectangle(int k, int l)
    {
        int a, b;
        for( a = 1; a<=k; a++){
        for(b = 1; b<=l; b++){
            if(a == 1 || a == k || b == 1 || b == 1)
            System.out.println("*");
            else
            System.out.print(" ");

        }
        System.out.println();
        }

    }



public static void main(String[] args) {
    int rows = 8; column = 22;
    print_rectagle(rows, column);
}
}


