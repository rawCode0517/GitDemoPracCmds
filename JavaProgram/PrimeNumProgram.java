package JavaProgram;
import java.util.Scanner;
public class PrimeNumProgram {

	public static void main(String[] args) {

	/*	Prime number is a number which is divisible by one and itself.
		Ex- 7 is a prime number as it is not divisible by 2,3,4,5,6 but divisible by 1 and 7
		Ex 6 is a prime number as it is divisible by 2,3 as well as 1 and 6 */
		
	Scanner ab = new Scanner(System.in);
	System.out.println("Enter any number to check whether it is a prime number or not");
	int num = ab.nextInt();
	int temp = 0;
	for(int i = 2;i<num;i++) {
		if(num%i==0) {
			temp =temp+1;
		} 
		
	}if(temp >0) {
		System.out.println(+num+" is not a prime number");	
		}else {
		System.out.println(num+" is prime number");	
		}
		
	primeNumberOneToHundred();
	} 

	public static void primeNumberOneToHundred() {
	// logic - first we need to run a loop from 1 -100
	// Then we need to run another loop to check if the number is prime or not
		int num = 100; int i,j,count;
		
		for(i=1; i<=num;i++) {
			count = 0;
			for (j=1;j<=i;j++) {
				if(i%j==0) {
				count++;	
				}
			}
			if(count ==2) {
				System.out.println(i + " is a prime number");	
		}
			
		}
		
		printFibonacciSeries();
	}
	
		//Write a program to print fibonacci series
		//Logic - Swapping logic to be used in programming

		public static void printFibonacciSeries() {
			
			int i,k=1,l=2,m;
			for(i=1;i<=10;i++) {
				m=k+l;
				System.out.println(m);
				k=l;
				l=m;
			}
			pallindromeNoProgram();
		}
		
		
		public static void pallindromeNoProgram(){{
			
	// a palindrome number is a number when reversed returns the same value. Ex - 424 should return 424 
	//Logic - we need to use reverse a number logic	
	//To find reverse we need to use this formula reverse = reverse*10+remainder
	int no=456; int rev =0; int z; int rem;
	z=no;
	
	while (no>0) {
		rem= no%10;
		rev = (rev*10)+rem;
		no=no/10;
	}
	if(z==rev) {
		System.out.println(rev+" Number is a pallindrome number");
	}else {
		System.out.println("Number is not pallindrome");
	}
		
		
		
		}
		}
}
