package LEETCODE;

public class longestsubstring {
    
    public static int largestUni( String str){
        int n = str.length();
        int res = 0;
        for(int i= 0; i<n; i++){
            boolean[] visited = new boolean[256];
            for(int j = i; j<n; j++)
            {
                if(visited[str.charAt(j)] == true)
                break;
                else{
                    res = math.max(res, j-i+1);
                    visited[str.charAt(j)] = true;
                }
            }
            visited[str.charAt(i)] = false;

        }
        return res;

    }
    public static void main(String[] args) {
        int len = largestUni(str);
        System.err.println(len);
    }

}
