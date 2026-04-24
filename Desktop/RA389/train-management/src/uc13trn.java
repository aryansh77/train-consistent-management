import java.util.*;
import java.util.stream.Collectors;

// Unique class name to avoid duplication
class UC13Bogie {
    String type;
    int capacity;

    public UC13Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }
}

// Main class as required
public class uc13trn {

    public static void main(String[] args) {

        List<UC13Bogie> bogies = new ArrayList<>();

        // Sample data
        bogies.add(new UC13Bogie("Sleeper", 72));
        bogies.add(new UC13Bogie("AC", 50));
        bogies.add(new UC13Bogie("General", 90));
        bogies.add(new UC13Bogie("Chair", 45));
        bogies.add(new UC13Bogie("Sleeper", 80));

        // Large dataset for better comparison
        for (int i = 0; i < 10000; i++) {
            bogies.add(new UC13Bogie("General", i % 100));
        }

        // -------- LOOP APPROACH --------
        long startLoop = System.nanoTime();

        List<UC13Bogie> loopResult = new ArrayList<>();
        for (UC13Bogie b : bogies) {
            if (b.getCapacity() > 60) {
                loopResult.add(b);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // -------- STREAM APPROACH --------
        long startStream = System.nanoTime();

        List<UC13Bogie> streamResult = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // -------- OUTPUT --------
        System.out.println("Loop Result Size: " + loopResult.size());
        System.out.println("Stream Result Size: " + streamResult.size());

        System.out.println("Loop Time (ns): " + loopTime);
        System.out.println("Stream Time (ns): " + streamTime);

        // Comparison
        if (loopTime < streamTime) {
            System.out.println("Loop is faster");
        } else if (streamTime < loopTime) {
            System.out.println("Stream is faster");
        } else {
            System.out.println("Both have similar performance");
        }
    }
}