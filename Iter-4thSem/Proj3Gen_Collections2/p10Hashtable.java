package Proj3Gen_Collections2;
import java.util.*;

public class p10Hashtable {
public static void main(String [] args) {
	String largeString="ajsb ascbab ajb va va va";
	String [] words = largeString.split("\\s");
	//create a hashtable to keep a track of word freq
	Hashtable<String,Integer> wordfreq = new Hashtable<>();
	//iterate through the string and keep track of word freq
	for(String word: words) {
		//convert word to lower case to ignore case sensitivity
		word=word.toLowerCase();
		//update word freq in hashtable
		
		if(wordfreq.containsKey(word))
			wordfreq.put(word, wordfreq.get(word)+1);
		else
			wordfreq.put(word, 1);
	}
	//finding the most occuring words
	int maxfreq=0;
	for(String word: wordfreq.keySet()) {
		int freq=wordfreq.get(word);
		if(freq>maxfreq) {
			maxfreq=freq;
		}
	}
	//print the most occuring words
	System.out.println("Most occuring word: ");
	for(String word: wordfreq.keySet()) {
		if(wordfreq.get(word)==maxfreq) {
			System.out.println(word+" : "+maxfreq+" times");
		}
	}
	
	
}
}
