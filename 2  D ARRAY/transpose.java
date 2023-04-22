public class transpose {
    
    static final int n = 4;
    static void transposematrix(int A[][] , int B[][],  )
    {

        int i,j;
        for(i = 0; i<n ; i++)
        for(j = 0; j<n; j++)
        B[i][j] = A[j][i];

    }
    public static void main(String[] args) {
        int A[][] = {
            {1,1,1,1},{2,2,2,2},{3,3,3,3},{4,4,4,4}
        };

        int B[][] = new int[n][n], i , j;
        transposematrix(A,B);
        System.out.println("result matrix is \n");
        for(i = 0; j<n; j++)
        System.out.println(B[i][j] + "");
        System.out.println("\n");
    }

}
