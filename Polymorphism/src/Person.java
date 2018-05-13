
public class Person {
//	attributes: name, age
//	actions/behaviors: walk, sleep, eat
	
	private String name;
	private int age;
	
//	constructor and getters and setters
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void eat() {
		System.out.println(this.name + " is eating.");
	}
	public void sleep() {
		System.out.println(this.name + " is sleeping.");
	}
	public void walk() {
		System.out.println(this.name + " is walking.");
	}
	

}
