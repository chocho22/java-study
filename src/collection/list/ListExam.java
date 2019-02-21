package collection.list;

import java.util.ArrayList;

public class ListExam {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
//		al.add(10);
//		al.add(20);
		al.add("abc");
//		al.add(true);
//		al.add('c');
//		al.add(1.1);

		System.out.println(al.size());
		al.remove(0);
		System.out.println(al.size());
		
		ArrayList<Integer> numList = new ArrayList<>();
		numList.add(1);
		
	}
}
