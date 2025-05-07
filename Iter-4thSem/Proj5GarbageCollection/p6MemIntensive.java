package Proj5GarbageCollection;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class p6MemIntensive {
    public static void main(String[] args) {
        // Print initial heap size
        printHeapInfo();

        List<Object> objects = new ArrayList<>();

        // Create a lot of objects
        for (int i = 0; i < 1000000; i++) {
            objects.add(new Object());
        }

        // Print heap size after creating objects
        printHeapInfo();

        // Clear the list to make objects eligible for garbage collection
        objects.clear();

        // Run garbage collection
        System.gc();

        // Print heap size after garbage collection
        printHeapInfo();
    }

    private static void printHeapInfo() {
        long totalMemory = Runtime.getRuntime().totalMemory();
        long freeMemory = Runtime.getRuntime().freeMemory();
        long timestamp = new Date().getTime();

        System.out.println("Timestamp: " + timestamp);
        System.out.println("Total Memory: " + totalMemory);
        System.out.println("Free Memory: " + freeMemory);
        System.out.println("-------------------------------");
    }
}
