package Proj2Gen;

class Book{
	int bookid;
	String bookname;
	double price;
	public Book(int bookid,String bookname,double price) {
		this.bookid=bookid;
		this.bookname=bookname;
		this.price=price;
	}
	
	//overloading to string
	public String toString() {
		return "Bookid: "+bookid+" Bookname: "+bookname+" price: "+price;
	}
	
	//overloading equals method
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		
		Book b = (Book) obj;
		return price==b.price;
	}
}
public class p2Book {//driverclass
 public static void main(String []args) {
	 Book b1=new Book(789,"PPP",1203.5);
	 Book b2 = new Book(777,"LLL",1203.5);
	 
	 
	 
	 System.out.println("Book details: ");
	 System.out.println(b1+"\n"+b2);
	 //comparing book obj
	 System.out.println("Price comparison: ");
	 if (b1.equals(b2)) {
         System.out.println("The books have the same price.");
     } else {
         System.out.println("The books have different prices.");
     }
 }
}
