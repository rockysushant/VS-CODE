import java.util.*;

public class overloading {
    
    public static void fun(String name){
        System.out.println(name);
    }

    public static void fun(int age){
        System.out.println(age);
    }


    public void fun(String name, int age){
        System.out.println(name+" " + age);

    }


    public static void main(String[] args) {
    

         Student s = new Student();
         
         s.name  = 'I';
         s.age = 22;
         s.fun(s.name,s.age);
    }
}
