package Proj6String;

public class p2ImmutablityString {
public static void main(String []args) {
	String original = "Hello";
	System.out.println("original string: "+original);
	
	String modified = original.concat("World");//creates modified as new string and adds hello of original + world	
	System.out.println("Modified String: "+ modified);
	System.out.println("Original String after modification: "+original);// no change as string is immutable
	System.out.println();
	//charsequence
	CharSequence charseq = "Hello World";
	//char sequence interface 
	// subsequence
	System.out.println("char at method");
	for(int i=0;i<charseq.length();i++) {
		System.out.print(charseq.charAt(i));
	}
	System.out.println();
	System.out.println();
	System.out.println("Subsequence");
	CharSequence subsequence = charseq.subSequence(6, 11);
	System.out.println(subsequence);
	System.out.println();
	
	System.out.println("length");
	System.out.println(charseq.length());
	
	System.out.println();
	System.out.println("tostring");
	System.out.println(charseq.toString());
	
	System.out.println();
	//immutable behaviour
	String a= "ABC";
	String b= a.concat("DEF");
	System.out.println("Are a == b ?"+a==b);
}
}
