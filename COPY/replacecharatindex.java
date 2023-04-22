public class replacecharatindex {
    
    public static void main(String[] args) {
        String str = "geeks gor geeks";
        int index = 6;
        char ch = 'f';
        System.out.println("original;" +str);

        StringBuilder sb  = new StringBuilder(str);
        sb.setCharAt(index,ch);
        System.out.println("modified str:" + sb);

    }
}
