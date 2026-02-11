package day14;

public class TypeCasting {
	

	public static void main(String[] args) {
		int n1 = 4;
		
		int n2 = 3;
		// Now(n1 -> int is passed to double without any error
		// because Int is smaller data type and double is higher data type
		// implicit type casting happens.
		
		int cube = (int)Math.pow(n1, n2); // explicit typeCasting
			
		System.out.println(n1 + " raise to "+n2 +" = "+cube );
	}

}


