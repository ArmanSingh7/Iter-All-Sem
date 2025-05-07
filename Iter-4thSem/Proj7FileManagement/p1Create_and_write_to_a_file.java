package Proj7FileManagement;
import java.io.*;
import java.util.*;
import java.util.Scanner;
public class p1Create_and_write_to_a_file {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	Date currentdate = new Date();
	String Date = currentdate.toString();
	File f = new File("D:\\text.txt");
	try {
		if(f.exists()) {
			System.out.println("File already exists..");
		}
		System.out.println("Enter your diary: ");
		String diary = sc.nextLine();
		
		FileWriter fw = new FileWriter(f);
		fw.write(Date+"\n");
		fw.write(diary+"\n");
		fw.close();
		
		System.out.println("Diary entry saved");
	}
	catch(Exception e) {
		System.out.println("error occured");
	}
}
}
