package collection.list;

import java.util.ArrayList;

public class ListExam31 {
	
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		for(int i = 10 ; i > 0 ; i--) {
			nums.add(i);
		}
		for(int i = 1 ; i <= 10 ; i++) {
			System.out.println(i + "의 위치 : " + nums.indexOf(i));
		}
		
	}
}
