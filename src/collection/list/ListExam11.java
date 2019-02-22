package collection.list;

import java.util.ArrayList;

public class ListExam11 {

	public static void main(String[] args) {
		ArrayList<String> strs = new ArrayList<String>();
		strs.add("안");
		strs.add("녕");
		strs.add("하");
		strs.add("세");
		strs.add("요");
		for(String str : strs) {
			System.out.print(str);
		}
	}
}
