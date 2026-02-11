package day7;

public class DriverClass1 {
	
	public static void main(String[] args) {
		Person personObj1 = new Person();
		
		// set personal values
		personObj1.name = "Shubham Mhatre";
		personObj1.age = 25;
		personObj1.gender = "Male";
		personObj1.active = false;
		
		Person personObj2 = new Person();
		
		// set person2 values
		personObj2.name ="pranjali Sharma";
		personObj2.age = 25;
		personObj2.gender = "Male";
		personObj2.active = false;
		
		System.out.println("-------------------------------------------");
		System.out.println("Person 1 Info");
		System.out.println("Name = " + personObj1.name);
		System.out.println("Age = " + personObj1.age);
		System.out.println("Gender = " + personObj1.gender);
		System.out.println("Active = " + personObj1.active);
		System.out.println("-------------------------------------------");
		System.out.println("Person 2 Info");
		System.out.println("Name = " + personObj2.name);
		System.out.println("Age = " + personObj2.age);
		System.out.println("Gender = " + personObj2.gender);
		System.out.println("Active = " + personObj2.active);
		
		
	}

}
