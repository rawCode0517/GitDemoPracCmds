package JavaProgram;

public class minNumInArray {

	public static void main (String[] args){
	//Write a program to find the minimum number in an array
		
	int [] a = {7,3,4,5,8,2,7,1};
	int min=a[0];// here minimum is 7
	
	for(int i =1;i<a.length;i++) {// here the loop checks and compares with the index values which starts from index 1 that is i=1, 
		
		if(a[i]<min) {
			min = a[i];
		}
		
	}
		
		System.out.println(min);
		printAJaggedArray();
	}
	public static void printAJaggedArray() {
		int [][] a = {{6,7,4},
					  {5},
					  {6,9,0,4}};
		
		System.out.println(a);// it prints the array class heap memory which starts with [[I@location
		System.out.println(a.length);//It gives the length of the array , in this the length or size of the array is 3
		
		for(int i = 0;i<a.length;i++) {
			
			for(int j =0;j<a[i].length;j++) {
			
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}

	