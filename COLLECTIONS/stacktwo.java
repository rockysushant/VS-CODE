public class stacktwo {
    
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        Stack.push("geeks");
        Stack.push("for");
        Stack.push("geeks");
        Stack.push("gggg");
        Iterator<String>itr = Stack.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next() + " ");
        }
        System.out.println();
        Stack.pop();
        itr = Stack.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next() +" ");
        }
    }
}
