package day1;

public class RemoveDuplicates {
	/*
	 * The first constructor.
	 */
	public int removeDuplicates(int[] nums){
		int temp = nums[0];
		int len = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == temp) {
				continue;
			} else {
				temp = nums[i];
				nums[len] = nums[i];
				len ++;
			}//of if
		}//of for i
		for (int i = 0; i < len; i++) {
			System.out.print(nums[i] + " ");
		}//of for i
		System.out.println();
		System.out.println("The length of the new array is :" + len);
		return len;
	}//of the first constructor
	/*
	 * The entrance of the program.
	 */
	public static void main(String[] args) {
		int[] num = {0,0,1,1,1,2,2,3,3,4};
		RemoveDuplicates r = new RemoveDuplicates();
		r.removeDuplicates(num);
	}//of main
}//of class RemoveDuplicates
