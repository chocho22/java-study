package collection.list;

import java.util.ArrayList;

public class ListExam2 {
	
	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<>();
		for(int i=10;i>0;i--) {
			numList.add(i*10);
		}
		for(int i=0;i<10;i++) {
			System.out.println(numList.get(i));
		}
	}
}
