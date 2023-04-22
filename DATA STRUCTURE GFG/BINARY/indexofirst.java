// import javax.swing.text.Position;

// package DATA STRUCTURE GFG.BINARY;

public class indexofirst {
    
    public static int firsOccur(int arr[], int n , int x)
    {
        for(int i = 0; i<n; i++)
        {
            if(arr[i] == x);
            return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int result = firsOccur(arr, n, 3);    // size hm harr meinn declare krenge aur kyu kre ?
        System.out.println(arr);
    }
}
