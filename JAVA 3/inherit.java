public class inherit {
    public static void main(String[] args) {
        new child();
        new parent();

    }
}

class parent{
    parent()
    {
        System.out.println("i am in parent class constructor");
    }
}

class child extends parent{
    child()
    {
        System.out.println("i am in parent class constructot");
    }
}
    

