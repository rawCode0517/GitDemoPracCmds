package JavaProgram;

public class maxNumArrayProgram {

	public static void main(String[] args) {
	
		int [] nums = {6,2,3,1,8,23,56,3,5,2,6};
		int max = nums[0]; // Here I am assuming the 0th index in the array to be maximum and then I will compare with other values in the arrays.Now the value is 6
		
		for(int i =1; i<nums.length;i++) {
			if(nums[i]>max) {
				max = nums[i];
			}
		
		}
		System.out.println(max);
	}

}
