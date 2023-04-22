
public class computingpower {
    public static int power(int x, int n){
    {
        int res = 1;
        for(int i = 0; i<n; i++)
        res = res*x;
        return res;
    }

    // if(n == 0)
    // return 1;
    // int temp = power(x, n/2);
    // temp = temp*temp;
    // if(n%2 == 0)
    // return temp;
    // else
    // return temp*n;
    }
 
    public static void main(String[] args) {
        int result = power(2,3);  // 2 power 3 is 8 but tha anse=wer is 3
        System.out.println(result);
    }
    
}
