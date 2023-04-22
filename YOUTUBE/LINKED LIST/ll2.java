import java.util.*;
public class ll2 {
    
    Node head;
   
    class Node{
        String data;
        Node next;

                                                                
        Node(String data){
            this.data = data;             
            this.next = null;
        }
    }

    //ad - first, last

    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }


    // public void addLast(String data){


    //     Node newNode = new Node(data);
    //     if(head == null){
    //         head = newNode;
    //         return;
    //     }
    //     Node currNode = head;
    //     while(currNode.next != null){     //  this is for not to loose head
    //         currNode = currNode.next;

    //     }
    //     currNode.next = newNode;



    // }



    // PRINT FUNCTION

    public static void printList( LinkedList<String> list){
        
    //     if(head == null){
    //         System.err.println("list is empty");
    //         return;

    //     }
    //     Node currNode = head;
    //     while(currNode != null){
    //         System.err.print(currNode.data + " ->");
    //         currNode = currNode.next;

    //     }
    // System.err.println("null");
    
    for(String val:list)
    System.out.println(val);

    }

    

//       // delete first

//       public void deleteFirsrt()
//       {
//         if(head == null){
//         System.err.println("the list is empty");
//         return;
//         }
//         head = head.next;   
//       }



//       // delete last
//       public void deleteLast(){
//         {
//             if(head == null){
//             System.err.println("the list is empty");
//             return;
//             }

        
//       }

//       if(head.next == null){
//         head = null;
//         return;
        
//     }

//     Node secondLast = head;
//     Node lastNode = head.next;  // head.next = null , lastnode = null
//     while(lastNode.next != null){ // null.next toh kuch hota hi nhi hai
//         lastNode = lastNode.next;
//         secondLast = secondLast.next;

//     }
//     secondLast.next = null;
// }

    
    public static void main(String[] args) {
      LinkedList<String> list = new LinkedList<>();
        
      
        list.addFirst("list");
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");
        
        printList(list);


        // list.addLast("list");
        // list.printlist();

        // list.addFirst("this");
        // list.printlist();
    }

}
