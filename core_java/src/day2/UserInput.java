package day2;

import java.util.Scanner;
public class UserInput {
	
	public static void main(String[] args) {
		//variable declaration
		
		int age;
		
		//user input 
		//for user input we require object of scanner class
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		age = input.nextInt();
		
		System.out.println("Your age = "+age);
		
		boolean isActive;
		
		System.out.println("Enter your status of active or not? ");
		isActive = input.nextBoolean();
		
		System.out.println("Active or not? "+isActive);
	}
	
}
