public class inttochar {
    
    static void Numbertocharacter(String s)
    {
        for(int i= 0; i<s.length(); i++)
        {
            switch(s.charAt(i))
            {
                case'1':
                System.out.print("one ");
                break;
                case'2':
                System.out.print("two");
                break;
                case'3':
                System.out.print("three");
                break;
                case'4':
                System.out.print("four");
                break;
                case'5':
                System.out.print("five");
                break;
                case'6':
                System.out.print("six");
                break;
                case'7':
                System.out.print("seven");
                break;
                case'8':
                System.out.print("eight");
                break;
                case'9':
                System.out.print("nine");
                break;
               
                default:
                System.out.print("unvalid");
                break;

            }
        }
    }


public static void main(String[] args) {
    int n = 123;
    Numbertocharacter(n+" ");
}
}

//print one hundred twenty three