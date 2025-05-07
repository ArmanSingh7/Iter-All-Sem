package Proj4_Error_handling;

public class p2NullpointerAlphaNumeric {
	public static void main(String []args) {
   	 String s="23ba1";
   	 
   	 try {
   		 checkmethod(s);
   	 }
   	 catch(Exception e) {
   		 System.out.println(e+e.getMessage());
   	 }
   	 
   	 
    }
    public static void checkmethod(String s) {
		 boolean found = false;
		 s=s.toLowerCase();
		 char []c = s.toCharArray();
		 String sp="";
		 
		 for(int i=2;i<c.length;i++) {
			 char curr= c[i];
			 char prev=c[i-1];
			 char prev2=c[i-2];
			
			 
			 if(Character.isDigit(curr)  && (isvowel(prev)||!isvowel(prev))&&(isvowel(prev2)||!isvowel(prev2))) {
				System.out.println("Numeric char "+curr);
				 found =true;
			 }
			 
			 
			 }
		 if(!found)
			 System.out.println("no such found");
    }
    public static boolean isvowel(char c) {
   	 c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
