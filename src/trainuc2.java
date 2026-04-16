import java.util.ArrayList;

public class trainuc2 {

    public static void main(String[] args) {

        // Step 1: Create ArrayList
        ArrayList<String> passengerBogies = new ArrayList<>();

        // Step 2: Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Step 3: Display bogies after insertion
        System.out.println("Passenger Bogies after addition:");
        System.out.println(passengerBogies);

        // Step 4: Remove a bogie (AC Chair)
        passengerBogies.remove("AC Chair");
        System.out.println("\nAfter removing 'AC Chair':");
        System.out.println(passengerBogies);

        // Step 5: Check if "Sleeper" exists
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("\nSleeper bogie exists in the train.");
        } else {
            System.out.println("\nSleeper bogie not found.");
        }

        // Step 6: Final state
        System.out.println("\nFinal Passenger Bogies:");
        System.out.println(passengerBogies);

        // Program continues
        System.out.println("\nApplication continues...");
    }
}