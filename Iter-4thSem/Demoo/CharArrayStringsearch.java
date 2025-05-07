package Demoo;
import java.util.Scanner;
import java.util.*;
public class CharArrayStringsearch {
	public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any String:");
        String a = obj.nextLine();
        char[] arr = a.toCharArray();
        
        System.out.println("Character Array:");
        for (char c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();
        
        System.out.println("Enter the character to search:");
        char b = obj.next().charAt(0);
        System.out.println("enter character again");
        CharSequence c = obj.next();
        //search
        System.out.println("is "+b+"present in"+a+ a.contains(c));
        // Find first occurrence
        int firstIndex = a.indexOf(b); 
        System.out.println("First occurrence of char " + b + " is found at index : " + firstIndex); 

        // Find last occurrence
        int lastIndex = a.lastIndexOf(b); 
        System.out.println("Last occurrence of char " + b + " is found at index: " + lastIndex); 
        
        // Display character array again
        System.out.println("Character Array After Search:");
        for (char d : arr) {
            System.out.print(d + " ");
        }

        obj.close();
    }
}