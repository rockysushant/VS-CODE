import java.util.*;
import java.util.io.*;

public class primeusingforloop {
    
public static void main(String[] args) {
    int num = 29;
    boolean flag = false;
    for(int i = 2; i<=num; i++)
    if(num%i ==0){
        flag = true;
        break;
    }
}
if(!flag)

System.out.println(num +"is  A PRIME");
else
System.out.println(num +"is  A nota a prime");

}

