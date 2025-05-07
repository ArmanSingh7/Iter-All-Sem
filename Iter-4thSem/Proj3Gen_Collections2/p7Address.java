package Proj3Gen_Collections2;
import java.util.*;
class Address{
	int plotno;
	String at;
	String post;
	public Address(int plotno,String at,String post) {
		this.plotno=plotno;
		this.at=at;
		this.post=post;
	}
	
	public String toString() {
		return "Plot no: "+plotno+" ,At: "+at+" ,Post: "+post;
	}
	
}
public class p7Address {
public static void main(String []args) {
	TreeMap<String,Address> address= new TreeMap<>();
	// inserting values
	address.put("Clark", new Address(007,"Kansas","state"));
	address.put("Bruce", new Address(773,"Gotham","city"));
	address.put("Peter", new Address(007,"NewYork","city"));
	
	//using iterator to display
	Iterator<Map.Entry<String, Address>> it = address.entrySet().iterator();
	while(it.hasNext()) {
		Map.Entry<String, Address> entry = it.next();
		System.out.println("Name: "+ entry.getKey()+", Address: "+entry.getValue());
	}
	
	
}
}
