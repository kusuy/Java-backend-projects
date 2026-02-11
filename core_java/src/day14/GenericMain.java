package day14;

import java.util.Scanner;

import day9.derived.Student;


/*
 * number division by 3 and 5 both -> Set messages to FIZZBUZZ
 * number divisible by 3 -> Set messages to FIZZ
 * number divisible by 5 -> Set messages  to BUZZ
 * number not divisible by 3 and 5 -> Set messages to number
 * */

public class GenericMain {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		Response<Object> response = new Response();
		if(n % 3== 0 && n % 5 == 0) {
			response.setMsg("FIZZBUZZ");
		}else if(n % 3 == 0) {
			response.setMsg("FIZZ");
			
		}else if(n % 5 == 0) {
			response.setMsg("BUZZ");
			
		}else {
			response.setMsg(n);
		}
		
		System.out.println(response);
		
		Student student = new Student(10, "Male", "Abdul Gani", 10001, 85.55);
		
		Response<Student> response2= new Response<Student>();
		
		response2.setMsg(student);
		System.out.println(response2);
	}
}

