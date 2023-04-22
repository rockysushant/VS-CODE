public class searchforlinerprogramme {
    
    static int Search(int arr[] , int n , int x)
    {
        for(int i = 0; i<n; i++)
        {
            if(arr[i] ==x)
            return i;
        }
        return -1;
    }



public static void main(String[] args) {
    int [] arr = {3,4,1,7,5,3};
    int n = arr.length;
    int x = 4;
    int index = Search(arr, n ,x);
    if(index == -1 )
    System.out.println("element is not present in the aaray");
    else
    System.out.println("element found at position" + index);
}
}