package Proj3Gen_Collections2;

import java.util.HashMap;


class Book {
    private int id;
    private String name;
    private String author;
    private int quantity;

    public Book(int id, String name, String author, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getQuantity() {
        return quantity;
    }
    public String toString() {
        return "Book: " +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
class Library{
	private HashMap<Integer,Book> booksmap= new HashMap<>();
	//method to add book
	public void addbook(int key,Book book) {
		booksmap.put(key, book);
	}
	//method to display
	public void display() {
		for(int key: booksmap.keySet())
		System.out.println("Key: "+key+" Value: "+booksmap.get(key));
	}
	//method to check if particular book is present
	public boolean containsbook(String bookname) {
		for(Book book:booksmap.values()) {
			if(book.getName().equals(bookname))
				return true;
		}
		return false;
	}
	//method to removebook
	public void removeBook(int key) {
        booksmap.remove(key);
    }
	
}

public class p5BookHashmap {//library
    

    public static void main(String[] args) {

    	Library lib= new Library();
        Book book1 = new Book(1235, "DSA", "AbCd", 5);
        Book book2 = new Book(2565, "Python", "PPP", 3);

        lib.addbook(1, book1);
        lib.addbook(2, book2);

        // Display collection of books
        System.out.println("Collection of books in the library:");
        lib.display();
        //check if a particular book is present
        String bookname="Python";
        System.out.println("Is "+bookname+" present in library "+ lib.containsbook(bookname));
        //remove the value using keyvalue
        
        int keytoremove=2;
        lib.removeBook(keytoremove);
        System.out.println("After removing book");
        lib.display();

        
    }
}
