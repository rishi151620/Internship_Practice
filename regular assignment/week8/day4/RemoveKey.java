import java.util.HashMap;
import java.util.Map;

public class RemoveKey {
    public static void main(String[] args) {
       
        Map<String, Integer> numbers = new HashMap<>();


        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        numbers.put("Four", 4);

        System.out.println("Map before removal: " + numbers);

        numbers.remove("Two");

        System.out.println("Map after removal: " + numbers);
    }
}