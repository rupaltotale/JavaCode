
public class Main {

//	parentClass objectName = new childClass();
	
	
	public static void main(String[] args) {
		Person person = new Person("Sita", 21);
		Person employee1 = new Employee("Joe", 34, 86791);
		
		Employee employee2 = new Employee("Swetha", 40, 67890);
		
		person.eat();
		employee1.eat();
		employee2.eat();
		employee2.work();
		
		
	}
	
	
}
