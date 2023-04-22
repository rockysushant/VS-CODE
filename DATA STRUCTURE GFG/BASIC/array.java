
// for left rotation 
public class array {

    void rotateArray(int array[],int n, int d{
        rotateArray(array, 0, d-1);
        rotateArray(array, d, n-1);
        rotateArray(array, 0, n-1);
    }
    rotateArray(int array[],int min, int max){
        
    while(min<max)
{
    swap(array[min],array[max]);
    min++;
    max--;
}
   


