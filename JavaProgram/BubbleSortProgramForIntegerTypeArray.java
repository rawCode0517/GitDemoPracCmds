package JavaProgram;

public class BubbleSortProgramForIntegerTypeArray {

	public static void main(String[] args) {
		
		int [] c = {34,2,65,15,12,0,9};//unsorted array of integer type
		
		
		for(int i =0;i<c.length;i++) //This For loop is used to get the number of rounds
		{
			
			int flag =0;
			for(int j=0;j<c.length-1;j++) // This for loop is used to compare the adjacent numbers present in integer type array. Ex- between 34 and 2 
			{
				if(c[j]>c[j+1]) // Applying Swapping logic
				{
				int temp = c[j];// stored the first value c[j] i.e 34 in temp variable	
					c[j]=c[j+1];// stored the value of c[j+1] i.e 2 in first index of array
					c[j+1]=temp;// storing the value in the index of c[j+1] in Second index
					flag =1;
				}

			}
			if(flag==0) {
				break;
			}			
		}
		for(int i =0;i<c.length;i++) {
			System.out.print(c[i]+",");

		}
		

	}

}
