import java.util.LinkedHashSet;

public class trainuc5 {

    public static void main(String[] args) {

        // Step 1: Create LinkedHashSet
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        // Step 2: Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Step 3: Add duplicate intentionally
        trainFormation.add("Sleeper"); // duplicate

        // Step 4: Display final formation
        System.out.println("Final Train Formation (No duplicates, order preserved):");
        System.out.println(trainFormation);
    }
}
