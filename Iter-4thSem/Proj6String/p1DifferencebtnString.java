package Proj6String;

public class p1DifferencebtnString {
public static void main(String []args) {
	//literals
	String s1= "AAA";
	String s2 = "AAA";
	//objects
	String s3 = new String("AAA");
	String s4 = new String("AAA");
	//memory usage
	System.out.println("str1 and str2 memory usage: "+System.identityHashCode(s1)+" "+System.identityHashCode(s2));
	
	System.out.println("str3 and str4 memory usage: "+System.identityHashCode(s3)+" "+System.identityHashCode(s4));
	
	//comparison using == operator
	System.out.println("Str1 == Str2 "+(s1==s2));//true
	System.out.println("Str3==Str4 "+(s3==s4));//false as objects are compared with different references
	
	System.out.println("Str1==Str3 "+(s1==s3));
	
	//comparison using equals method comparing contents 
	 System.out.println("str1.equals(str2): " + s1.equals(s2)); // should be true, as content is the same
     System.out.println("str1.equals(str3): " + s1.equals(s3)); // should be true, as content is the same
     System.out.println("str3.equals(str4): " + s3.equals(s4)); // should be true, as content is t
	

}
}
