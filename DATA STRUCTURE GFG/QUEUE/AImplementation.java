public class AImplementation {
    class Queue{
        int size,cap;
        int arr[];
        Queue(int c){
            cap = c;
            size = 0;
            arr = new int[arr];
        }
    }

    boolean isFull(){
        return(size==cap);

    }

    boolean isEmpty(int x){
        return(size==0);
    }

    void enque(int x){
        if(isFull())return;
        arr[size] =x;
        size++;
        
    }
}
