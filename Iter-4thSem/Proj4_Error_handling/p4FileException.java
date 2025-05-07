package Proj4_Error_handling;
import java.io.*;
import java.util.Scanner;
class FileNotfoundException extends Exception{
	public FileNotfoundException(String message) {
		super(message);
	}
}
class FileCannotRead extends Exception{
	public FileCannotRead(String message) {
		super(message);
	}
}
public class p4FileException {
public static void main(String []args) {
	if(args.length==0) {
		System.out.println("Usaege: File reading");
		return;
	}
	try {
		readfilecontent(args[0]);
	}
	catch(FileNotfoundException | FileCannotRead e) {
		System.out.println(e);
	}
}
private static void readfilecontent(String filepath) throws FileNotfoundException,FileCannotRead {
	File file = new File(filepath);
	try {
		if(!file.exists())
			throw new FileNotfoundException("File doesn't exist");
		Scanner sc = new Scanner(file);
		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());
			throw new FileCannotRead("File cannot read");
		}
			
		
		}
	
	catch(Exception e) {
		System.out.println(e);
	}

	
}
}
