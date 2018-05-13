
public class Person {
//	name, age, job
	
	private String name;
	private int age;
	private Job job;
	
	public Person(String name, int age, Job job) {
		this.name = name;
		this.age = age;
		this.job = job;
	}

//	getters
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public int getSalary() {
		return job.getSalary();
	}
	
	public String getRole() {
		return job.getRole();
	}
	
	public int getID() {
		return job.getID();
	}

	
	
//	age, job - salary, role, ID
	
	public void setAge(int age) {
		if(age>=0) {
			this.age = age;
		}
	}
	
	public void setSalary(int salary) {
		job.setSalary(salary);
	}
	
	public void setRole(String role) {
		job.setRole(role);
	}
	
	public void setID(int ID) {
		job.setID(ID);
	}
	
	
	

}
