package Proj3Gen_Collections2;
import java.util.*;

class Car implements Comparable<Car>{
	private int ModalNo;
	private String name;
	private int stock;
	public Car(int ModalNo, String name,int stock) {
		this.ModalNo=ModalNo;
		this.name=name;
		this.stock=stock;
	}
	public int getmodalno() {
		return ModalNo;
	}
	public void setmodalno(int ModalNo) {
		this.ModalNo=ModalNo;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	public int getstock() {
		return stock;
	}
	public void setstock(int stock) {
		this.stock=stock;
	}
	public int compareTo(Car c1) {
		return Integer.compare(this.stock,c1.stock);
	}
	public String toString() {
		return ModalNo+" "+name+" "+stock;
	}
	
	
}
public class p3CarArraylist {
public static void main(String []args) {
	ArrayList <Car> carlist = new ArrayList<>();
	carlist.add(new Car(2020,"Mercedes",19));
	carlist.add(new Car(2121,"BMW",47));
	carlist.add(new Car(3232,"Audi",59));
	
	Collections.sort(carlist);
	
	System.out.println("List of car after sorting");
	for(Car car: carlist) {
		System.out.println(car);
	}
	
	
	
}
}
