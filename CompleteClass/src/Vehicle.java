
public class Vehicle {
	// attributes: fields
	private int size;
	private String color;
	private int wheels;
	private int numbOfGears;

	public static void main(String[] args) {
		// Vehicle car = new Vehicle(100, "red", 5);
		// System.out.println(car.size);
		// System.out.println(car.color);
		// System.out.println(car.wheels);

		Vehicle truck = new Vehicle(200, "white", 8, 5);
		System.out.println(truck.size);
		System.out.println(truck.color);
		System.out.println(truck.wheels);
		System.out.println(truck.numbOfGears);

	}

	// Constructor #1
	Vehicle(int size, String color, int wheels, int numbOfGears) {
		this.size = size;
		this.color = color;
		this.wheels = wheels;
		this.numbOfGears = numbOfGears;
	}

	// Constructor #2
	Vehicle(String color, int wheels, int numbOfGears) {
		this.size = 150;
		this.color = color;
		this.wheels = wheels;
		this.numbOfGears = numbOfGears;
	}

	// Constructor #3
	Vehicle(int size, String color, int numbOfGears) {
		this.size = size;
		this.color = color;
		this.wheels = 14;
		this.numbOfGears = numbOfGears;
	}

	// Behaviors: methods

	void onOrOff() {
		System.out.println("Vehicle is on");
	}

	void speedUp() {
		System.out.println("Speeding up");
	}

	void brake() {
		System.out.println("braking");
	}

	// Getters: Syntax and examples

	// dataType getSize() {
	// return size;
	// }

	int getSize() {
		return size;
	}

	String getColor() {
		return color;
	}

	public int getWheels() {
		return wheels;
	}

	public int getNumbOfGears() {
		return numbOfGears;
	}

	// Setters: examples only

	void setSize(int size) {
		this.size = size;
	}

	void setColor(String color) {
		this.color = color;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public void setNumbOfGears(int numbOfGears) {
		this.numbOfGears = numbOfGears;
	}

}

// constructors: characteristics.

// A constructor doesn’t have a return type.
//
// The name of the constructor must be the same as the name of the class.
//
// Unlike methods, constructors are not considered members of a class.
//
// A constructor is called automatically when a new instance of an object is
// created.




