import java.util.Scanner;
class Students{
	int roll;
	String name;
	String course;
	public void input_Students() {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter roll");
		this.roll =sc.nextInt();
		System.out.println("enter name");
		this.name=sc.next();
		System.out.println("enter course name");
		this.course =sc.next();
	}
	public void display_Student() {
		System.out.println("name - "+this.name);
		System.out.println("roll - "+this.roll);
		System.out.println("course - "+this.course);
	}
}
class Exam extends Students{
	int mark1,mark2,mark3;
	public void input_Marks() {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter mark 1:");
		this.mark1= sc.nextInt();
		System.out.println("enter mark 2:");
		this.mark2= sc.nextInt();
		System.out.println("enter mark 3:");
		this.mark3= sc.nextInt();
	}
	public void diplay_result() {
		System.out.println("mark 1:"+this.mark1);
		System.out.println("mark 2:"+this.mark2);
		System.out.println("mark 3:"+this.mark3);
	}
}

public class program9 {

	public static void main(String[] args) {
		Exam[] exams = new Exam[5];
		for (int i=0;i<exams.length;i++) {
			System.out.println("enter details for student:"+(i+1));
			exams[i]= new Exam();
			exams[i].input_Students();
			exams[i].input_Marks();
			
		}
		for(int i=0;i<exams.length;i++) {
			System.out.println("Result of student "+(i+1));
			exams[i].display_Student();
			exams[i].diplay_result();
			System.out.println();
		}
		
		// TODO Auto-generated method stub

	}

}
