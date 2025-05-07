package Demoo;

public class q2NullpointerVowel_alphanum {
     public static void main(String []args) {
    	 String s="a1b2c3d4e5";
    	 
    	 try {
    		 checkmethod(s);
    	 }
    	 catch(Exception e) {
    		 System.out.println(e+e.getMessage());
    	 }
    	 
    	 
     }
     public static void checkmethod(String s) {
		 boolean found = false;
		 char []c = s.toCharArray();
		 
		 for(int i=2;i<c.length;i++) {
			 char curr= c[i];
			 char prev=c[i-1];
			 char prevprev=c[i-2];
			 if(Character.isDigit(curr)  && isvowel(prev)&& !isvowel(prev)) {
				 System.out.println("Numeric char "+ curr+" found after vowel and consonant");
				 found =true;
			 }
			 
		 }
		 if(!found)
			 System.out.println("No numeric char found after a vowel or consonant");
		 }
     public static boolean isvowel(char c) {
    	 c = Character.toLowerCase(c);
         return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
     }
}
