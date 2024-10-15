package JavaProgram;
import java.util.*;

public class SelectionSortProgramPractice {

	public static void main(String[] args) {
		
		int []a =  {6,1,5,13,42,16,2};
		int temp;
		for(int i =0;i<a.length;i++) 
		{
			for(int j =i+1;j<a.length;j++) {
				
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];	
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");	
		}
		
		
		
	}

}
