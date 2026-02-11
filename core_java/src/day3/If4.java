package day3;

import java.util.Scanner;

public class If4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1,n2,n3,n4,n5,sum,avg;
		System.out.println("Enter marks of five subject: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		n4 = sc.nextInt();
		n5 = sc.nextInt();
		
		sum = n1+n2+n3+n4+n5;
		
		avg = sum/5;
		
		System.out.println("Total Marks = "+sum);
		System.out.println("Average Marks = "+avg);
		if(n1 >= 35 && n2 >= 35 && n3 >= 35 && n4 >= 35 && n4 >= 35 && n5 >= 35) {
			//calculate grade
			
			if(avg >= 90) {
				System.out.println("A Grade");
			}
			if(avg >= 70) {
				System.out.println("B Grade");
		    }
			if(avg >= 50) {
				System.out.println("C Grade");
		
	        }
			else {
				System.out.println(" D Grade");
			}

}
		else {
			
			System.out.println("Fail");	
		}
	}
}