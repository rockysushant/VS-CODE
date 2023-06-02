import java.util.*;


public class Aafirst {

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("INdia", 100);
        hm.put("pak", 1010);
        hm.put("Us", 1030);

        System.out.println(hm);
        System.out.println(hm.size());
        System.out.println(hm.containsKey("Us"));
        System.out.println(hm.get("pak"));
        // System.out.println(hm.clear());
        System.out.println(hm.isEmpty());
    }
}
