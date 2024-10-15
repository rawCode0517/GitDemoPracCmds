
package JavaProgram;
import java.util.Scanner;
public class ReverseANumber {

	public static void main(String[] args) {
		
		int num = 879;int reverse =0;int remainder =0;
		
		while(num!=0){
			remainder = num%10;
			reverse = reverse*10+remainder;
			num = num/10;
		}
		System.out.println("Reverse of the number is "+reverse);
	
		reverseAnotherNum();
	
	}

	public static void reverseAnotherNum() {
		Scanner pn = new Scanner(System.in);
	
		System.out.println("Enter a number");
		int num = pn.nextInt();
		int revVal=0;
		int remaVal;
		
		while(num!=0) {
			//remaVal = num%10;
			revVal = revVal*10+num%10;
			num = num/10; //Ex- 4567/10 where quotient is 456
		}
			System.out.println("The number is "+ revVal);
		
			reverseAString();
	}

	public static void reverseAString() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a name");
		String name = s.nextLine();
		String reV ="";
		
		for(int i = name.length()-1; i>=0;i-- ) {
			
			reV = reV+name.charAt(i);
			
		}
		System.out.println("The string after reverse is "+reV);
		
		
		
		
	}


}
