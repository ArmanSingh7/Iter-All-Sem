package Proj2Gen;



class Student{
	String name;
	String roll;
	int age;
	//constructor with roll as int
	public Student(String name,int roll,int age) {
		this.name=name;
		this.roll=Integer.toString(roll); //convert int to string
		this.age=age;
	}
	//constructor with roll as string
	public Student(String name,String roll,int age) {
		this.name=name;
		this.roll=roll;//
		this.age=age;
	}
	public void print() {
		System.out.println("Name: "+ name);
		System.out.println("Roll number: "+roll);
		System.out.println("Age: "+age);
		System.out.println();
	}
	
}
public class p1_driver_Student {
public static void main(String []args) {
	Student s1= new Student("ABC",111,19);
	Student s2= new Student("DEF",123,18);
	
	System.out.println("Student details: ");
	s1.print();
	s2.print();
}
}
