import java.util.*;

// Class representing a Goods Bogie
class GoodsBogie {
    String type;
    String cargo;

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String getType() {
        return type;
    }

    public String getCargo() {
        return cargo;
    }
}

// Main class as required
public class uc12train {

    public static void main(String[] args) {

        // Step 1: Create list of goods bogies
        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum")); // valid
        bogies.add(new GoodsBogie("Open", "Coal"));             // valid
        bogies.add(new GoodsBogie("Box", "Grain"));             // valid
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum")); // valid

        // Uncomment below to test invalid case
        // bogies.add(new GoodsBogie("Cylindrical", "Coal")); // invalid

        // Step 2: Apply safety validation using stream
        boolean isSafe = bogies.stream().allMatch(bogie -> {
            if (bogie.getType().equalsIgnoreCase("Cylindrical")) {
                return bogie.getCargo().equalsIgnoreCase("Petroleum");
            }
            return true; // other types allowed
        });

        // Step 3: Display result
        if (isSafe) {
            System.out.println("Train is SAFETY COMPLIANT ✅");
        } else {
            System.out.println("Train is NOT SAFE ❌");
        }
    }
}