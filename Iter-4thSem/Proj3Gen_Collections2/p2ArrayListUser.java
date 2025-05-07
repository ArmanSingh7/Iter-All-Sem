package Proj3Gen_Collections2;
import java.util.*;
class User{
	private String name;
	private int age;
	public User(String name, int age) {
		this.name=name;
		this.age=age;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	public int getage() {
		return age;
	}
	public void setage(int age) {
		this.age=age;
	}
	public void print() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
	
}
class Agecomparator implements Comparator<User>{
	public int compare(User user1, User user2) {
		return Integer.compare(user1.getage(), user2.getage());
	}
}
public class p2ArrayListUser {
public static void main(String[] args) {
	ArrayList<User> userlist = new ArrayList<>();
	userlist.add(new User("Popp",56));
	userlist.add(new User("Abc",33));
	userlist.add(new User("Ddd",26));
	
	System.out.println("Before sorting: ");
	for(User user : userlist) {
		user.print();
		System.out.println();
	}
	Collections.sort(userlist, new Agecomparator());
	
	System.out.println("After sorting: ");
	for(User user : userlist) {
		user.print();
		System.out.println();
	}
	
}
}
