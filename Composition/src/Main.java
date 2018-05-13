
public class Main {
	public static void main(String[] args) {
		Job newJob = new Job(300, "Teacher", 85769);
		String name = "nilesh";
		Person employee = new Person(name, 50, newJob);
		
		
		System.out.println("Nilesh's salary is " + employee.getSalary());
		
		System.out.println(employee.getID());
		
		employee.setSalary(3000);
		System.out.println("Nilesh's new salary is " + employee.getSalary());
		
	}

}
