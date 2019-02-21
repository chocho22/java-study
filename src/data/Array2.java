package data;

public class Array2 {
	public static int num = (int)(Math.random()*20)+1;
	public static int[] initArray(int size) {
		int[] nums = new int[size];
		for(int i = 0 ; i < size ; i++) {
			for(int j = 0 ; j < i ; j++) {
				if(num==nums[j]) {
					i--;
				} else {
					nums[i] = num;
				}
			}
		}
		return nums;
	}
	public static void printArray(int[] array) {
		for(int i = 0 ; i < array.length ; i++) {
			System.out.println("array[" + i + "] = " + array[i]);
		}
	}
	public static int[] extendsSize(int size2, int[] array) {
		int[] tmps = array;
		array = new int[array.length+size2];
		
		for(int i = 0 ; i < array.length+size2 ; i++) {
			array[i] = tmps[i];
			if(i>=tmps.length) {
				array[i] = num;
				for(int j = 0 ; j < i ; j++) {
					if(num==array[i]) {
						i--;
					}else {
						array[i] = num;
					}
				}
			}
		}
		return array;
	}
	public static void main(String[] args) {
		int[] nums = initArray(5);
		nums = extendsSize(2,nums);
		printArray(nums);
//		
		System.out.println(args.length);
		
		for(String str : args) {
			System.out.println(str);
		}
//		int[] nums = new int[3];
//		for (int i = 0; i < nums.length; i++) {
//			nums[i] = i + 1;
//		}
//		int[] tmps = nums;
//		nums = new int[5];
//		for (int i = 0; i < 3; i++) {
//			nums[i] = tmps[i];
//		}
//		for (int i = 3; i < nums.length; i++) {
//			nums[i] = i + 1;
//		}
//		for (int num : nums) {
//			System.out.println(num);
//		}
	}
}
