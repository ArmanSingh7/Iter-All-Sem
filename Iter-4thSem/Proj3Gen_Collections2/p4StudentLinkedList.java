package Proj3Gen_Collections2;
import java.util.*;
class Student{
	private String name;
	int age;
	int mark;
	public Student(String name,int age, int mark) {
		this.name=name;
		this.age=age;
		this.mark=mark;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	public String toString() {
		return "Student name: "+name+" age: "+age+" mark: "+mark;
	}
	//overriding equals method
	 public boolean equals(Object obj) {
	        if (this == obj)
	            return true;
	        
	        Student student = (Student) obj;
	        return age == student.age &&
	                mark == student.mark &&
	                name.equals(student.name);
	    }
}
public class p4StudentLinkedList {
	static LinkedList<Student> stud = new LinkedList<>();//static variable
	public static void checkexist(Student student) {//static method
		if(stud.contains(student))
			System.out.println("Student exists in list");
		else
			System.out.println("Student doesn't exist");
	}
	
  public static void main(String []args) {
	  
	  
	  Scanner sc = new Scanner(System.in);
//	  System.out.println("Enter the no. of students you want: ");
//	  int size=sc.nextInt();
//	  System.out.println("Enter the name, age and mark");
//	  
//	  for(int i=0;i<size;i++) {
//		String name=sc.next();
//		int age= sc.nextInt();
//		int mark=sc.nextInt();
//		Student student = new Student(name,age,mark);
//		stud.add(student);
//	  }
	  Student s1= new Student("PPP",12,55);
	  Student s2= new Student("LOL",22,59);
	  Student s4= new Student("LMN",23,79);
	  
	  stud.add(s1);
	  stud.add(s2);
	  stud.add(s4);
	  
	  
	  System.out.println("Displaying Student info");
	  for(Student studs: stud) {
		  System.out.println(studs);
	  }
	  //b ask the user to enter a stud a=obj and print existence
	  System.out.println("Enter the stud details to check existence: ");
	  String name1= sc.next();
	  int age1=sc.nextInt();
	  int mark1=sc.nextInt();
	  Student s3= new Student(name1,age1,mark1);
	  checkexist(s3);
	  
	  //c remove specific student object
	  System.out.println("Enter student details to remove (name age mark):");
      name1 = sc.next();
      age1 = sc.nextInt();
      mark1 = sc.nextInt();
      Student removeStudent = new Student(name1, age1, mark1);
      stud.remove(removeStudent);
      System.out.println("Displaying after removal:");
      for(Student studs: stud) {
		  System.out.println(studs);
	  }
      //d counting
      System.out.println("Count: "+stud.size());
      //e checking 2 
      // Check if the two student objects share the same values
      if (s1.equals(s4)) {
          System.out.println("The two student objects share the same values.");
      } else {
          System.out.println("The two student objects do not share the same values.");
      }
  }
}
