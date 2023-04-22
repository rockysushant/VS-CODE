public class squarestarpattern {
    
    static void print-rectangle(int k,int l)
    {
        int a,b;
        for(a = 1; a<=k; a++){
            for(b = 1; b<=1; b++){
                if(a==1 ||  a==k || b==1 || b== 1)
                System.out.println("*");

                else
                System.out.println(" ");
            }
            System.out.println();
        }
    }


public static void main(String[] args) {
    
    int rows = 8, column = 22;
    print-rectangle(rows,column);
}

}
