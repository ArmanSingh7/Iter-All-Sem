package proj8InputOutputStreamEg;

import java.io.FileInputStream;
import java.io.*;

public class p2OutputWrite {
	public static void main(String[]args) {
		String data="this is java";
		try {
			OutputStream out = new FileOutputStream("D:\\filee.txt");//ndvnv
			byte []arr = data.getBytes();
			out.write(arr[1]);
			out.write(arr);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	}