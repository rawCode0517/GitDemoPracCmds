package JavaProgram;

public class SelectionSortProgram {

	public static void main(String[] args) {
		
		int [] s = {5,8,52,14,9,12,61,2};
		int temp;
		for(int i =0;i <s.length;i++) // this loop is to capture the value starting from first index 
		{
			int min = i;
			for(int j= i+1;j<s.length;j++) // this loop is for comparing values from 2nd index of the array and storing the value in another variable
			{
				if(s[j]>s[min])// This condition is used for capturing the index of j to min variable i.e i. 
				{
					min=j;
				}
			
			}
			temp = s[i];
			s[i]= s[min];
			s[min]=temp;				
		}
		for(int i=0;i<s.length;i++) {
			System.out.print(s[i]+" ");
		}
	}

}


