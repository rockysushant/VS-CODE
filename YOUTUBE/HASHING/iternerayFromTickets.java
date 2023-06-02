import java.util.HashMap;
import java.io.*;

public class iternerayFromTickets {

    public static getStart(HashMap<String,String> tickets){
        HashMap<String, String> revMap = new HashMap<>();
        for(String key: tickets.keySet()){
            revMap.put(tickets.get(key), key);
        }

        for(String key: tickets.keySet()){
            if(!revMap.containsKey(key)){
                return key;
            }
        }

        return null;

    }

    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Benglaru");
        tickets.put("mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);
        System.out.println(start);
        for (String Key : tickets.keySet()) {
            System.out.println("->" + tickets.get(start));
            start = tickets.get(start);
        }

    }
}
