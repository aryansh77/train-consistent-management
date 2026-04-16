import java.util.HashMap;
import java.util.Map;

public class trainuc6 {

    public static void main(String[] args) {

        // Step 1: Create HashMap
        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        // Step 2: Insert bogie-capacity mapping
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);
        bogieCapacity.put("First Class", 40);

        // Step 3: Display all bogies with capacity
        System.out.println("Bogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " -> Capacity: " + entry.getValue());
        }

        // Program continues
        System.out.println("\nCapacity mapping completed successfully.");
    }
}