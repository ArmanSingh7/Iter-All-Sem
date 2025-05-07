package Proj3Gen_Collections2;
import java.util.*;

public class p12MinheapPriority {
public static void main(String[] args) {
	// Declare an array of integers
    int[] arr = {1, 2, 10, 8, 7, 3, 4, 6, 5, 9};

    // Create a min heap using PriorityQueue
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    for (int num : arr) {
        minHeap.offer(num); // Add elements to the min heap
    }

    // Dequeue elements of the min heap and print them
    System.out.println("Dequeued elements of the min heap:");
    while (!minHeap.isEmpty()) {
        int element = minHeap.poll(); // Dequeue element from the min heap
        System.out.print(element + " ");
    }
}
}
