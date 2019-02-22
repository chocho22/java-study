package collection.list;

import java.util.ArrayList;

public class List21 {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			nums.add(i + 1);
		}
		
		ArrayList<Integer> nums2 = new ArrayList<>();
		for (int i = 9; i >= 0; i--) {
			int inNum = nums.get(i);
			nums2.add(inNum);
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println(nums2.get(i));
		}
	}
}