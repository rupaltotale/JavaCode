
public class Dog implements IAnimalCharacteristics{

	@Override
	public void eat() {
		System.out.println("The dog is eating");
	}

	@Override
	public void walk() {
		System.out.println("The dog is walking");		
	}

	@Override
	public void runs() {
		System.out.println("The dog is running");		
	}

	@Override
	public void see() {
		System.out.println("The dog is seeing");		
	}


	@Override
	public void sleep() {
		System.out.println("The dog is sleeping");		
	}

}
