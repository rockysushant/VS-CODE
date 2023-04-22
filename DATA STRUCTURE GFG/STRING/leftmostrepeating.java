
public class leftmostrepeating {

    public static int LeftRot(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j))
                    return i;

            }
        }
        return -1;

    }

    public static void main(String[] args) {
        String str = "geeksforgeeks";

       

        // System.out.println(LeftRot(str));
    }
}









// efiicient soln 

 static final int CHAR = 256;
  int leftmost(String str)
  {
    boolean[] visited = new boolean[CHAR];
    int res = 1;
    for(int i = str.length()-1, i>=0; i--)
    {
        if(visited[str.charAt(i)])
        res = i;
        else
        visited[str.charAt(i)] = true;
    }
    return res;
  }