package Proj3Gen_Collections2;

import java.util.HashSet;

public class p9HashsetRepeat {
	public static void main(String[] args) {
        int[] array = {4, 2, 8, 3, 6, 7, 2, 8, 4, 5, 6};

        HashSet<Integer> seen = new HashSet<>();

        System.out.print("Repeating integers in the array: ");
        for (int num : array) {
            if (!seen.add(num)) { // If num already exists in seen set
                System.out.print(num + " ");
            }
        }
        System.out.println(seen);//hashset doesnt contains duplicate elements
    }
}