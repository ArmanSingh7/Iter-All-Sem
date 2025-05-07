package Proj6String;
import java.util.Scanner;
public class p5Comparison {
public static void main(String []args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a base string: ");
	String baseString = sc.next();
	System.out.println("Enter the number of times it should concatenate");
	int x= sc.nextInt();
	StringBuilder strbuilder = new StringBuilder(baseString);
	StringBuffer strbuffer = new StringBuffer(baseString);
	long start,start1,end,end1,duration1,duration2;
	
	
	//string buffer concatenate
	start=System.currentTimeMillis();
	for(int i = 0;i<x;i++) {
		strbuilder.append(baseString);
	}
	end=System.currentTimeMillis();
	duration1=end-start;
	System.out.println("Duration for str builder "+duration1+" milisecond");
	System.out.println("final string length = "+strbuilder.length());
	
	//string builder concatenate
	start1=System.currentTimeMillis();
	for(int i=0;i<x;i++) {
		strbuffer.append(baseString);
	}
	end1=System.currentTimeMillis();
	duration2=end1-start1;
	System.out.println("Duration for strbuffer "+duration2+" milisecond");
	System.out.println("final string length= "+strbuffer.length());
	
	//comparison
	if(duration1>duration2)
		System.out.println("strbuffer was fast by "+ (duration1-duration2)+"milisecond");
	else if(duration2>duration1)
		System.out.println("strbuilder was fast by "+ (duration2-duration1)+"milisecond");
	else
		System.out.println("both are same");
	
}
}
