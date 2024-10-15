package JavaProgram;

public class MiscellaneousPractice {

	public static void main(String[] args) {
		// Write a program to reverse a string

		String mac = "JENAMANI";
		for(int i =mac.length()-1;i>=0;i--){
			System.out.print(mac.charAt(i));
		}
		System.out.println();
		swapANoProgram();
	}

	
	
	public static void swapANoProgram(){
		int a = 765;
		int b= 567;
		int temp;
		
		temp = a; //765
		a= b; // 567
		b=temp;
		
		System.out.println(a);	
		System.out.println(b);	
	
		
		checkPallindromeNumber();
	}
	
	public static void checkPallindromeNumber() {
		
		int nom = 636;
		//Now reverse the number
		
		int tempt=nom;
		
		int rev =0,rem;
		//Reverse a number logic is applied
		while(nom!=0) {
			rem = nom%10;
			rev=rev*10+rem;
			nom=nom/10;
		}
		if(tempt==rev) {
			System.out.println("Number is pallindrome");	
		}else{
			System.out.println("Number is not pallindrome");
		}
		
		
	}
	
	
	
	
}
