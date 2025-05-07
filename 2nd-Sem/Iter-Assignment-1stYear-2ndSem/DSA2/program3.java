import java.util.Scanner;
class Student{
	int roll,dsa_mark;
	String name;
	void getdata() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter roll");
		roll = sc.nextInt();
		System.out.println("enter name");
		name=sc.next();
		System.out.println("enter dsa mark");
		dsa_mark=sc.nextInt();
	
	}
	void showdata() {
		System.out.println(name);
		System.out.println(roll);
		System.out.println(dsa_mark);
	}
}
public class program3 {

	public static void main(String[] args) {
		Student[] s = new Student[5];
		for(int i =0;i<s.length;i++)
		{
			s[i]=new Student();
			System.out.println("enter the details of student"+(i+1));
			s[i].getdata();
		}
		Student s1 =s[0];
		for (int i=1;i<s.length;i++)
		{
			if(s[i].dsa_mark > s1.dsa_mark)
				s1 = s[i];
		}
		System.out.println("info of student with highest dsa");
		s1.showdata();
		
		// TODO Auto-generated method stub

	}

}
