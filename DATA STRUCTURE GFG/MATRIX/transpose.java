public class transpose {
    
    public static transpose(int mat[n][n])
    {
        int temp = [n][n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++)
            temp[i][j] = mat[j][i];

            for(int i = 0; i<n; i++)
            for(int j = 0; j<n; j++)
            mat[i][j] = temp[i][j];
        }
    }
    
}
