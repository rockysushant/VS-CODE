import java.util.Stack;

public class parentheses {

    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);                  // WHAT IS THIS

            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } else {

                if (s.isEmpty()) {
                    return false;
                }                                 // YEH ELSE WALE PART MEIN AAGAY NA?
                if ((s.peek() == '(' && ch == ')')
                        || (s.peek() == '{' && ch == '}')
                        || (s.peek() == '{' && ch == '}')) {
                    s.pop();

                } else {
                    return false;
                }
            }
        }

        if (s.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }                                                            // BRACCKETS BHI STORAGE LETA HAI JUST LIKE DATATTYPES?

    public static void main(String[] args) {

        String str = "{(}";
        System.out.println(isValid(str));

    }
}
