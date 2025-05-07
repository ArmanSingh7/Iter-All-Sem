package Proj1;
abstract class LibraryResource{
	private String title;
	private String author;
	public LibraryResource(String title,String author) {
		this.title=title;
		this.author=author;
	}
	public String gettitle() {
		return title;
	}
	public String getauthor() {
		return author;
	}
	public void setauthor(String author) {
		this.author=author;
	}
	public void settitle(String title) {
		this.title=title;
	}
	public abstract void displaydetails();
}
//book class extending library

class Book extends LibraryResource{
	private int pagecount;
	public Book(String title,String author,int pagecount) {
		super(title,author);
		this.pagecount=pagecount;
	}
	public int getpagecount() {
		return pagecount;
	}
	public void setpagecount(int pagecount) {
		this.pagecount = pagecount;
	}
	//overriding display abstract method
	public void displaydetails() {
		System.out.println("Title: "+gettitle());
		System.out.println("Author: "+getauthor());
		System.out.println("Page unit: "+getpagecount());
	}
}

class Magazine extends LibraryResource{
	private String issuedate;
	public Magazine(String title,String author,String issuedate) {
		super(title,author);
		this.issuedate=issuedate;
	}
	public String getissuedate() {
		return issuedate;
	}
	public void setissuedate(String issuedate) {
		this.issuedate=issuedate;
	}
	//overriding display details abstract
	public void displaydetails() {
		 System.out.println("Title: " + gettitle());
	        System.out.println("Author: " + getauthor());
	        System.out.println("Issue Date: " + getissuedate());
	}
}

class Dvd extends LibraryResource{
	private int duration;
	public Dvd(String title, String author, int duration) {
		super(title, author);
        this.duration = duration;
	}
	public int getduration() {
        return duration;
    }
	public void setduration(int duration) {
        this.duration = duration;
    }
	//overriding display details
	 public void displaydetails() {
	        System.out.println("Title: " + gettitle());
	        System.out.println("Author: " + getauthor());
	        System.out.println("Duration: " + getduration() + " minutes");
	    }
}
public class program6_Library {
	public static void main(String[]args) {
		LibraryResource book = new Book("Okok","me",341);
		LibraryResource magazine = new Magazine("Xyz","D","Feb 2024");
		LibraryResource dvd = new Dvd("Spiderman","StanLee",144);
		//calling each display
		
		System.out.println("Book details: ");
		book.displaydetails();
		System.out.println();
		
		System.out.println("Magazine details: ");
		magazine.displaydetails();
		System.out.println();
		
		System.out.println("DVD details: ");
		dvd.displaydetails();
		
	}

}
