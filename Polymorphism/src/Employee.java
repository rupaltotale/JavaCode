
public class Employee extends Person {

	private int ID;
	public Employee(String name, int age, int ID) {
		super(name, age);
		this.ID = ID;
	}
//	atrribute: ID
//	action: work
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
//	method overloading - static
//	method overriding - dynamic 
	public void work() {
		System.out.println(this.getName() + " is working");
	}
	
	public void work(int hours) {
		System.out.println(this.getName() + " is working for " + hours + " hours");
	}
	@Override
	public void eat() {
		System.out.println("The employee is eating");
	}
	@Override
	public void sleep() {
		System.out.println("The employee is sleeping");
	}
	@Override
	public void walk() {
		System.out.println("The employee is walking");
	}
	
//	@Override
//	public String getName() {
//		System.out.println("returning name");
//		return super.getName();
//	}
	
	
}
