public class reverseastring {
    
    public static void main(String[] args) {
        String  str = "hello world";
        StringBuffer sb = new StringBuffer();
        sb.append(str);        // whats this?
        sb.reverse();
        
        System.out.println(sb);
    }
}
