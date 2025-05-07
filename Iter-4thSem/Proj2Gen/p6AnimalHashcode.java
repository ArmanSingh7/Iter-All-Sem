package Proj2Gen;


class Animal{
	String name;
	String color;
	String type;
	public Animal(String name, String color, String type) {
		this.name=name;
		this.color=color;
		this.type=type;
	}
	public int hashCode() {
		return System.identityHashCode(this);
	}
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("color: "+color);

		System.out.println("type: "+type);

	}
}
public class p6AnimalHashcode {
	public static void main(String[]args) {
		Animal dog= new Animal("Dog","Brown","Pet");
		Animal cat= new Animal("Cat","Orange","Pet");
		Animal lion= new Animal("Lion","Golden","Wild");
		
		//hashcode
		System.out.println("Hash code of Dog: " + dog.hashCode());
        System.out.println("Hash code of Cat: " + cat.hashCode());
        System.out.println("Hash code of Lion: " + lion.hashCode());
	}

}
