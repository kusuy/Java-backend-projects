package day9.main;


import day9.derived.Student;

public class ClassMain {
	
	public static void main(String[] args) {
		Student s1 = new Student();
		
		s1.setAge(30);
		s1.setGender("female");
		s1.setName("Rohini sulbe");
		s1.setPercentage(85.55);
		s1.setRollNo(10);
		
		
		Student s2 = new Student( 85, "Male", "Rohit", 15,35.66);				
				
				
				
		System.out.println(s1);
		System.out.println(s2);
		
	}

}
