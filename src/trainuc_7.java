import java.util.*;

// Bogie class (custom object)
class Bogie {
    String name;
    int capacity;

    // Constructor
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Display method
    public String toString() {
        return name + " -> Capacity: " + capacity;
    }
}

public class trainuc_7 {

    public static void main(String[] args) {

        // Step 1: Create List of Bogie objects
        List<Bogie> bogies = new ArrayList<>();

        // Step 2: Add bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));

        System.out.println("Before Sorting:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // Step 3: Sort using Comparator (by capacity)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("\nAfter Sorting (by Capacity - Ascending):");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // Program continues
        System.out.println("\nSorting completed.");
    }
}