package Proj1;
interface Vehicle{
	abstract void accelerate();
	abstract void brake();
	
}
class car1 implements Vehicle{
	public void accelerate() {
		System.out.println("Car is accelerating..");
	}
	public void brake() {
		System.out.println("Car brakes..");
	
	}
	//method overloading
	public void accelerate(int speed) {
        System.out.println("Car is accelerating at speed: " + speed + " km/h");
    }

    public void accelerate(int speed, int duration) {
        System.out.println("Car is accelerating at speed: " + speed + " km/h for " + duration + " seconds");
    }
	
}
class Bicycle implements Vehicle{
	public void accelerate() {
		System.out.println("Bicycle is accelerating..");
	}
	public void brake() {
		System.out.println("Bicycle brakes..");
	}
	public void accelerate(int speed) {
        System.out.println("Bicycle is accelerating at speed: " + speed + " km/h");
    }

    public void accelerate(int speed, int duration) {
        System.out.println("Bicycle is accelerating at speed: " + speed + " km/h for " + duration + " seconds");
    }
}
public class program8_Vehicle {
	public static void main(String[] args) {
        // Instantiate Car object
        car1 c1 = new car1();
        System.out.println("Car:");
        c1.accelerate();
        c1.brake();
        c1.accelerate(60);
        c1.accelerate(80, 10);

        System.out.println();

        // Instantiate Bicycle object
        Bicycle b1 = new Bicycle();
        System.out.println("Bicycle:");
        b1.accelerate();
        b1.brake();
        b1.accelerate(20);
        b1.accelerate(30, 5);
    }

}
