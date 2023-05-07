public class first {

    public static void fun(String str) {

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));

        }
        

    }

    public static void main(String[] args) {
        String firstName = "Sushant";
        String LatName = "Soni";
        String fullName = firstName + " " + LatName;

        fun(fullName);

    }
}
