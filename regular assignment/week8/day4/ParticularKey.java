import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class ParticularKey{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      
        Map<String, Integer> map = new HashMap<>();
        
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("orange", 3);

      
        System.out.println("Enter the element to check whether it is present or not--->");
      String keyCheck=sc.nextLine();
        if (map.containsKey(keyCheck)) {
            System.out.println(keyCheck + " is present in the map");
        } else {
            System.out.println(keyCheck + " is not present in the map");
        }
    }
}