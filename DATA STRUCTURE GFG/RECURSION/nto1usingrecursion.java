public class nto1usingrecursion {
    public static void print(int n)
    {
        if(n ==0)
        return; // yha pe kya return kiya?
        System.err.println(n + "");// yha pe hum n print kiye toh pahle 1 to 4 print hona chaiye na
        print(n-1);
    }
    public static void main(String[] args) {
        int n = 4;
        print(n);
    }
    // time complexity = 0(n)
    // recursive time complexity = t(n) = t(n-1) +0(1)
    // Auxillary space = 0(n)
    
}
