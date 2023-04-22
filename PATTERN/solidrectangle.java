import java.util.*;

public class solidrectangle {
     static void rectangle(int n,int m) {
        int i, j;
        for(int i = 1;i<=n; i++){
            for(int j = 1; j<=m; j++){
                System.out.print("*");
            }
            System.out.println("n");

        }
        
    }
    public static void main(String[] args) {
        int rows, columns;
        System.out.println("enter no of colums");
        rectangle(rows, columns);
    }

}
