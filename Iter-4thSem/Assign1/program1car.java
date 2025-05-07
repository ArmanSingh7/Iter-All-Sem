package Proj1;
class car{
	private String model;
	private String make;
	public car(String model, String make) {
		this.model=model;
		this.make=make;
	}
	public String getmodel() {
		return model;
	}
	public void setmodel(String model) {
		this.model = model;
	}
	public String getmake() {
		return make;
	}
	public void setmake(String make) {
		this.make = make;
	}
	
}
public class program1car {
	public static void main(String []args) {
		car mycar1= new car("Toyota","camry");
		car mycar2=new car(null,null);
		System.out.println("Initial make and model of car1: "+mycar1.getmake()+" "+mycar1.getmodel());
		System.out.println("Initial make and model of car2: "+mycar2.getmake()+" "+mycar2.getmodel());
		mycar2.setmake("Mercedes");
		mycar2.setmodel("s1");
		System.out.println("Initial make and model of car1: "+mycar2.getmake()+" "+mycar2.getmodel());
	}
}
