package day3;

import java.util.Scanner;

public class If3 {
	
	//WAP to accept two numbers and operator(+,/,-,*)
	// Based on operator perform result
	//input 3  condition 5
	  public static void main(String[] args) {
		  
		  Scanner sc = new Scanner(System.in);
		  int n1, n2;
		  char operator;
		  
		  System.out.println("Enter 2 numbers: ");
		  n1 = sc.nextInt();
		  n2 = sc.nextInt();
		  
		  System.out.println("Choose opertaor [+,-,*,/] ");
		  operator = sc.next().charAt(0);
		  int result;
		  if (operator == '+') {
			  result = n1 + n2;
			  /*System.out.pritnln("Addition of "+n1+", "+n2+" is "+result);*/
			  System.out.printf("Addition of %d, %d is %d", n1,n2,result);
		  }
		  else if (operator == '-') {
			  result = n1 - n2;
			  System.out.printf("Subtraction of %d, %d is %d", n1,n2,result);
		  }
		  else if (operator == '*') {
			  result = n1 *n2;
			  System.out.printf("Multiplication of %d, %d is %d", n1,n2,result);
		  }
		  else if (operator == '/') {
			  if(n2 == 0) {
				  System.out.printf("Cannot divide By zero");
			  }else {
				  result = n1 / n2;
				  System.out.println("Invalid operatot");
			  }
			  
		  }
		  
	  }

}
