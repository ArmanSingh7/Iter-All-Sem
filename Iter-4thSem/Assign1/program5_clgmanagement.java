package Proj1;

class college{
	private String collegename;
	private String collegeLoc;
	public college(String collegename,String collegeLoc) {
		this.collegename=collegename;
		this.collegeLoc=collegeLoc;
	}
	public String getcollegename() {
		return collegename;
	}
	public String getcollegeLoc() {
		return collegeLoc;
	}
	public void displayCollegeinfo() {
		System.out.println("College name: "+collegename);
		System.out.println("Location: "+collegeLoc);
	}
	
	
}
class Student{
	private int studentId;
	private String studentName;
	private college clg;
	public Student(int studentId,String studentName,college clg) {
		this.studentId=studentId;
		this.studentName=studentName;
		this.clg=clg;
	}
	public void displayStudentinfo() {
		System.out.println("Student id: "+studentId);
		System.out.println("Student name: "+studentName);
    	System.out.println("College info:-- ");
    	clg.displayCollegeinfo();

		
	}
}
public class program5_clgmanagement {
	public static void main(String []args) {
		college clg1 = new college("SRM University","Chennai");
		college clg2 = new college("VIT University","Bhopal");
		
		Student s1= new Student(1010,"ABC",clg1);
		Student s2 = new Student(1011,"DEF",clg2);
		
		System.out.println("College 1 Information:");
        clg1.displayCollegeinfo();
        System.out.println();

        System.out.println("College 2 Information:");
        clg2.displayCollegeinfo();
        System.out.println();

        // Display student information
        System.out.println("Student 1 Information:");
        s1.displayStudentinfo();
        System.out.println();

        System.out.println("Student 2 Information:");
        s2.displayStudentinfo();
		
		
	}

}
