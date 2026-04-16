import java.util.*;

// Bogie class
class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String toString() {
        return name + " -> Capacity: " + capacity;
    }
}

public class trainuc10 {

    public static void main(String[] args) {

        // Step 1: Create list of bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));

        // Step 2: Display original list
        System.out.println("Bogie List:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // Step 3: Stream → map → reduce
        int totalCapacity = bogies.stream()
                .map(b -> b.capacity)       // extract capacity
                .reduce(0, Integer::sum);   // sum all values

        // Step 4: Display result
        System.out.println("\nTotal Seating Capacity: " + totalCapacity);

        // Program continues
        System.out.println("\nAggregation completed.");
    }
}