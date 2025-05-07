package Proj3Gen_Collections2;
import java.util.*;


public class p11smallestMissingno {
  public static void main(String [] args) {
	  int[] arr= {6,4,7,2,1,3};
	  
	  //creating hashmap
	  HashMap<Integer, Integer> elements = new HashMap<>();
	  
	  //populate the hashmap
	  for(int num:arr) {
		  elements.put(num, 1);
	  }
	  //find the smallest +ve no.
	  int smallestno=1;
	  while(elements.containsKey(smallestno)) {
		  smallestno++;
	  }
	  //printout
	  System.out.println("Smallest +ve: "+smallestno);
	  
  }
}
