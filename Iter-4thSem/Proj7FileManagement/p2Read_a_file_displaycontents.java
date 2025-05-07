package Proj7FileManagement;
import java.io.*;
import java.util.*;
public class p2Read_a_file_displaycontents {
public static void main(String []args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the file name with path: ");
	String fo=sc.next();
	
	try {
		File f1= new File(fo);
		if(f1.exists())
			System.out.println("File already exists..");
		Scanner datareader = new Scanner(f1);
		System.out.println("Contents in the file: ");
		
		while(datareader.hasNextLine()) {
			String filedata=datareader.nextLine();
			System.out.println(filedata);
		}
		datareader.close();
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}
