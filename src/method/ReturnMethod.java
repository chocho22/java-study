package method;

public class ReturnMethod {

	static int indexOf(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] nums = new int[3];
		nums[0] = 7;
		nums[1] = 4;
		nums[2] = 1;
		System.out.println("5의 위치는 : " + indexOf(nums, 5));
		
		//System.out.println("5의 위치는 : " + idx); 에 idx가 대입되니까
		// indexOf(nums, 5)도 대입할수있음.

	}
}
