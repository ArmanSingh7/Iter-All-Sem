package Proj1;

class Point{
	private double x;
	private double y;
	public Point(double x, double y) {
		this.x=x;
		this.y=y;
	}
	//copy constructor
	public Point(Point other) {
		this.x =other.getx();
		this.y=other.gety();
	}
	public double getx() {
		return x;
	}
	public void setX(double x){
		this.x=x;
	}
	public double gety(){
		return y;
	}
	public void setY(double y) {
		this.y=y;
	}
	
	
}
public class program3_point {
	public static void main(String []args) {// Create a point
        Point p1 = new Point(3.5, 4.2);

        // Create a copy of the point
        Point p2 = new Point(p1);

        // Modify one point
        p2.setX(7.8);

        // Print values of both points
        System.out.println("Point 1: (" + p1.getx() + ", " + p1.gety() + ")");
        System.out.println("Point 2: (" + p2.getx() + ", " + p2.gety() + ")");
   
	}

}
