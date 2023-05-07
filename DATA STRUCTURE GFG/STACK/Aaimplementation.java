public class Aaimplementation {
    
    class MyStack{

        int arr[];
        int cap;
        int top;

        MyStack(int c){
            top = -1;
            cap = c;
            arr = new int[cap];

        }


         void push(int x){                     // static laga rhe hai toh error aa rha hai kyu
            top++;
            arr[top] = x;

        }
          int pop(){
            int res = arr[top];
            top--;
            return res;

         }

         int size(){
            return top++;
         }


         boolean isEmpty(){
            return (top==-1);
         }
    }



    public static void main(String[] args) {
      Aaimplementation  s = new Aaimplementation();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        System.out.println(s);
    }
}
