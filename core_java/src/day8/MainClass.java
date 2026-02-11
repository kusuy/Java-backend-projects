package day8;

public class MainClass {
	
	public static void main(String[] args) {
		Person p1 = new Person();
		
		System.out.println(p1);
		
		Person p2 = new Person("Abdul", 25,"Male",false);
		
		System.out.println(p2);
		
		//Object is created with default constructor
		// now I want to modify values
		// changes private = setters
		
		p1.setName("Rohan Pandey");
		p1.setGender("Male");
		p1.setActive(false);
		p1.setAge(55);
		System.out.println(p1);
	}

}
