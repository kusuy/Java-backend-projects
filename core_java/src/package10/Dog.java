package package10;

public class Dog extends Animal {

	public Dog() {
		System.out.println("Dog object is created");
	}
	
	public void bark() {
		System.out.println("Dog is barking");
	}

	@Override
	public void eat() {
		System.out.println("I am dog and I am eating");
	
	} 
    @Override
    public void walk() {
	    System.out.println("i am dog and I am running");
	    }
}
