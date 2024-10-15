package JavaProgram;
import java.util.*;

public class Functions {

	int []a = new int [10];

	public static void main(String[] args) {
		
		
		
		
			
	}
void getData() {//this method is for input of data
	
	Scanner sc = new Scanner(System.in);
	for(int i=0;i<10;i++) {
		System.out.println("Enter number "+ i);
		a[i]=sc.nextInt();
	}
}

void putData() {// This method is used to display the output
	for(int i=0;i<10;i++) {
		System.out.println(a[i]);
	}
}

void insertionSort() {
	
}

}

