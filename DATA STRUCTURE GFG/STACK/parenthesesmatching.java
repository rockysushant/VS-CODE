public class parenthesesmatching {
    


    static boolean fun(char a, char b){
        return((a =='(' && b == ')')  || (a =='{' && b == '}') ||   (a =='[' && b == ']'));

    }

    public static void main(String[] args) {
        String str = ({[]});
        System.out.println(fun(0, 0));

    }
}
