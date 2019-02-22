package collection.list;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchList2 {
	
	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<>();
		for(int i=0;i<6;i++) {
			int ranNum = (int)(Math.random()*20)+1;
			numList.add(ranNum);
			}
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.println("번호를 , 를 기준으로 입력해주세요.");
		String strNum = scan.nextLine();
		String[] strNums = strNum.split(",");
		ArrayList<Integer> anList = new ArrayList<>();
		for(int i = 0 ; i < strNums.length ; i++) {
			anList.add(Integer.parseInt(strNums[i]));
		}
		
		System.out.println(anList);
		int count = 0;
		for(int i1 = 0 ; i1 < anList.size() ; i1++) {
			if(anList.get(i1) != -1) {
				count++;
			}
		}
		System.out.println("numList : " + numList);
		System.out.println("anList : " + anList);
		System.out.println("맞춘 갯수 : " + count);
		
//		int count = 0;
//		for(int i=0;i<6;i++) {
//			int ranNum = (int)(Math.random()*20)+1;
////			System.out.println(numList.indexOf(ranNum));
//			if(numList.indexOf(ranNum) != -1) {
//				count++;
//			}
//		}
//		System.out.println(count);
	}
}
