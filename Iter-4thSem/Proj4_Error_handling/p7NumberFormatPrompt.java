package Proj4_Error_handling;

import java.util.Scanner;

public class p7NumberFormatPrompt {
	public static void main(String[] args) {
   	 Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        boolean input=false;
        int num = 0;
        
       while(!input) {
       	try {
       		
       		String inp= scanner.nextLine();
       		num=Integer.parseInt(inp);
       		input=true;
       	}
       	catch(NumberFormatException e) {
       		System.out.println("Invalid input re-enter");
       	}
       }
        
        scanner.close();
        System.out.println("Int val = "+num);
    }
}