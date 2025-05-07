package proj8InputOutputStreamEg;
import java.io.FileInputStream;
import java.io.InputStream;
public class p1InputStream {
public static void main(String[]args) {
	String data="this is java";
	byte []arr=new byte[26];
	try {
		InputStream input = new FileInputStream("D:\\filee.txt");//ndvnv
		System.out.println("Read one byte: "+input.read());//110
		input.mark(2);//tells how many bytes to read
		System.out.println(input.read());//100
		
		System.out.println(input.available());//3
		String dataa=new String(arr);
		System.out.println(dataa);
		input.close();
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}