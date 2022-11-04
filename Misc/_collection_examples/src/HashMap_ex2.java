import java.util.HashMap;
import java.util.Map;

public class HashMap_ex2 {
    public static void main(String[] args) {

        HashMap <String, Integer> empHashMap = new HashMap<>();

        empHashMap.put("Rajan", 123);
        empHashMap.put("Ach", 456);
        empHashMap.put("Mira", 789);

        for (var entry: empHashMap.entrySet()){
            String name = entry.getKey();
            Integer id = entry.getValue();
            System.out.println(name + " " + id);
        }
    }
}
