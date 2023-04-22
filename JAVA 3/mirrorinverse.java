public class mirrorinverse {
    static boolean isMirrorInverse(int arr[]) // is pure part ko kya kahengeee
    {
        for(int i = 0; i<arr.length; i++){ 

            



            if(arr[arr[i]] != i)
            return false;

        }
        return true;
    }
        public static void main(String[] args) {
            int arr[] = {1,0,4,3,2};
            if(isMirrorInverse(arr))
            System.out.println("yes");
            else
            System.out.println("no");
            }
    
    
    
    }
