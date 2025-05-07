package Proj1;
class Rectangle{
	private int length;
	private int width;
	public Rectangle(int length,int width) {
		this.length=length;
		this.width=width;
	}
	public int getlength() {
		return length;
	}
	public void setlength(int length) {
		this.length=length;
	}
	public int getwidth() {
		return width;
	}
	public void setwidth(int width) {
		this.width=width;
	}
	public int area() {
		return length*width;
	}
	public int perimeter() {
		return 2*(length+width);
	}
}
public class program2_Rectangle {
	public static void main(String []args) {
		Rectangle a = new Rectangle(8,6);
		System.out.println("Area: "+a.area());
		System.out.println("Perimeter: "+a.perimeter());
	
	}

}
