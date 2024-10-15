package JavaProgram;
import java.util.*;

public class FactorialProgramming {

	public static void main(String[] args) {

		
	Scanner val = new Scanner(System.in);	
		
	System.out.println("Enter any number to find the factorial of a number");
	int fact = 1;
	int input = val.nextInt();
	for(int i = 1; i<=input; i++) {
		fact= fact*i;
		
	}
	System.out.println("The factorial of the number is "+ input + " is "+fact);
	
	factorialLogic2();
	}



	public static void factorialLogic2() {
		
		int fact2 = 1;
		
	System.out.println("Type a number");
	Scanner val = new Scanner (System.in);
 	int input2 = val.nextInt();
	
	for(int j =input2; j >1; j--) {
		fact2 = fact2*j;
	}
		System.out.println("The factorial of the number should be"+input2+" is "+fact2);
			

	}


}

	