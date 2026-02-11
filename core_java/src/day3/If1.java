package day3;

//WAP to check whether the number is positive or negative
import java.util.Scanner;

public class If1 {
	
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		num = sc.nextInt();
		
		if(num >= 0) {
			System.out.println("Number: "+num+" is positive");
			
		}else {
			System.out.println("Number: "+num+" is negative");
		}
	}
	
	

}
