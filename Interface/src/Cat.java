
public class Cat implements IAnimalCharacteristics{

	@Override
	public void eat() {

		System.out.println("The cat is eating");
	}

	@Override
	public void sleep() {
		System.out.println("The cat is sleeping");
		
	}

	@Override
	public void walk() {
		System.out.println("The cat is walking");
		
	}

	@Override
	public void runs() {
		System.out.println("The cat is running");
		
	}

	@Override
	public void see() {
		System.out.println("The cat is seeing");
		
	}

}
