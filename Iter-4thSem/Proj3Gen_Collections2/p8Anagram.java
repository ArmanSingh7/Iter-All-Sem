package Proj3Gen_Collections2;
import java.util.*;

public class p8Anagram {
 public static void main(String [] args) {
	 String s1= "listen";
	 String s2="silent";
	 
	 //remove spaces and convert it to lower case
	 s1=s1.replaceAll("\\s", "").toLowerCase();
	 s2=s2.replaceAll("\\s", "").toLowerCase();
	 //if lengths of 2 str are different they cannot be anagrams
	 // same letters different words
	 if(s1.length()!=s2.length()) {
		 System.out.println(s1+" and "+s2+ " are not anagrams");
		 return;
	 }	 
	 //creating hashmap
	 HashMap<Character,Integer> charfreq= new HashMap<>();
	 // Populate charFrequencyMap with characters from str1 and their frequencies
	 for(char c: s1.toCharArray()) {
		 charfreq.put(c, charfreq.getOrDefault(c, 0)+1);
	 } 
	 System.out.println(charfreq);
	 //chck chr instr2 against charfreq
	 for(char c:s2.toCharArray()) {
		//if char doesn't exist in charfreq or freq is 0,strings are not anagrams
		 if(!charfreq.containsKey(c)|| charfreq.get(c)==0) {
			 System.out.println(s1+" and "+s2+" are not anagrams. ");
			 return;
		 } //decrement freq of char in charfreq
		 charfreq.put(c, charfreq.get(c)-1);
	 }	 
	 //if all characters in str2 match char
	 System.out.println(s1+" and "+s2 +" are anagrams. ");
 }
}
