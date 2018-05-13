
public class Main {
	public static void main(String[] args) {
//		instantiate an object of class vehicle 
//		Syntax:
//		className objectname = new className();
		
		Vehicle car = new Vehicle(50, "green", 4, 5);
		
//		car: getters
		int carSize = car.getSize();
		System.out.println("Car Size = " + carSize);
		
		String carColor = car.getColor();
		System.out.println("Car color = " + carColor);
		
		System.out.println("Car wheels = " + car.getWheels());
		
		System.out.println("Car number of gears  = " + car.getNumbOfGears());
		
//		Cycle: getters
		Vehicle cycle = new Vehicle(25, "blue", 2, 8);

		int cycleSize = cycle.getSize();
		System.out.println("Cycle Size = " + cycleSize);
		
		System.out.println("Cycle color = " + cycle.getColor());
		
		System.out.println("Cycle wheels = " + cycle.getWheels());
		
		System.out.println("Cycle gears = " + cycle.getNumbOfGears());
		System.out.println();
		
//		car: setters
		car.setSize(70);
		System.out.println("Car Size = " + car.getSize());
		car.setColor("purple");
		System.out.println("Car color = " + car.getColor());
		car.setWheels(6);
		System.out.println("Car wheels = " + car.getWheels());
		car.setNumbOfGears(10);
		System.out.println("Car gears = " + car.getNumbOfGears());
		
	}
	
}
