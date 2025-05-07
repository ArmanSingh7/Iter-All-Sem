package Proj7FileManagement;

import java.io.File;
import java.util.Scanner;

public class p5ListWIthdesiredfiles {

    public static void main(String[] args) {
        // Prompt user for directory path
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the directory path: ");
        String directoryPath = scanner.nextLine();
        scanner.close();

        // List text files in the given directory
        listTextFiles(directoryPath);
    }

    public static void listTextFiles(String directoryPath) {
        File directory = new File(directoryPath);

        // Check if the provided path is a directory
        if (!directory.isDirectory()) {
            System.out.println("Error: The provided path is not a directory.");
            return;
        }

        // Get list of files in the directory
        File[] files = directory.listFiles();

        // Display text files
        System.out.println("Text files in the directory:");
        for (File file : files) {
            if (file.isFile() && file.getName().endsWith(".txt")) {
                System.out.println(file.getName());
            }
        }
    }
}
