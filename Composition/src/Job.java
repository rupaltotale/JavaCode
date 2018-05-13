
public class Job {
//	attributes: salary, role, ID
	private int salary;
	private String role;
	private int ID;
	
	public Job(int salary, String role, int iD) {
		this.salary = salary;
		this.role = role;
		ID = iD;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		if(salary>0) {
			this.salary = salary;
		}
		else {
			System.out.println("Salary cannot be negative");
		}
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}
	
	
	
	

}
