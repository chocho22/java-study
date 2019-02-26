package collection.list;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchList3 {
	
	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<>();
		
		for(int i = 0 ; i < 6 ; i++) {
			int num = (int)(Math.random()*45)+1;
			numList.add(num);
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.println(", 로 구분하여 숫자를 6개 입력해주세요.");
		String str = scan.nextLine();
		scan.close();
		System.out.println("입력하신 숫자는 : " + str);
		String[] strList = str.split(",");
		
		int count = 0;
//		for(int i = 0 ; i < strList.length ; i++ ) {
//			int num = Integer.parseInt(strList[i]);
//			if(numList.indexOf(num) != -1) {
//				count++;
//			}
//		}
		for(String str2 : strList) {
			int num2 = Integer.parseInt(str2);
			if(numList.indexOf(num2) != -1) {
				count++;
			}
		}
		System.out.println(numList);
		System.out.println("맞춘 갯수는 : " + count);
	}
}
