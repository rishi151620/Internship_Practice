import java.util.HashMap;
import java.util.Map;

public class HashRetrieve {
    public static void main(String[] args) {
      
        Map<String, Integer> map = new HashMap<>();

        map.put("apple", 10);
        map.put("orange", 5);
        map.put("banana", 7);

        String key = "apple";
            int value = map.get(key);
            System.out.println(key + " = " + value);
    }
}