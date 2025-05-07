package Proj3Gen_Collections2;
import java.util.*;

class Pair<K,V>{
	private K key;
	private V value;
	public Pair(K key,V value) {
		this.key=key;
		this.value=value;
	}
	public K getkey() {
		return key;
	}
	public void setkey(K key) {
		this.key=key;
	}
	public V getvalue() {
		return value;
	}
	public void setvalue() {
		this.value=value;
	}
	
}
public class p1_keyNvalue {
  public static void main(String []args) {
	  Pair<Integer,String> p1= new Pair<>(1,"AK");
	  Pair<String,Double> p2= new Pair<>("P",5.5);
	  
	  System.out.println("Pair 1: key= "+p1.getkey()+" value= "+p1.getvalue());
	  System.out.println("Pair 2: key= "+p2.getkey()+" value= "+p2.getvalue());
	  
  }
}
