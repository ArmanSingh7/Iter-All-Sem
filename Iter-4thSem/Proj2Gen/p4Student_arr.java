package Proj2Gen;
class student1 implements Comparable<student1>{
	String name;
	int rn;
	int totalmark;
	public student1(String name,int rn,int totalmark) {
		this.name=name;
		this.rn=rn;
		this.totalmark=totalmark;
	}
	
	public int compareTo(student1 s) {
		return Integer.compare(this.rn, s.rn);
	}

	
}
public class p4Student_arr {
 public static void main(String []args) {
	 student1[] studs = {new student1("AS7",7,99),new student1("PRT",8,89),new student1("OPL",55,78)};
	 
	 int searchrn= 7;
	 
	 student1 found= linearsearch(studs,searchrn);
	 
	 //displaying searched student
	 if(found!=null) {
		 System.out.println("Student found :");
		 System.out.println("Name: "+found.name);
		 System.out.println("Roll no.: "+found.rn);
		 System.out.println("Total marks: "+found.totalmark);
	 }
	 else
		 System.out.println("Student with roll "+searchrn+" not found");
	 //linear search
	
	 
 }
 public static student1 linearsearch(student1[] stud,int search) {
	 for(student1 studs: stud) {
		 if(studs.rn==search)
			 return studs;
	 }
	 return null;
 }
}
