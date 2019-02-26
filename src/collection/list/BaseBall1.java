package collection.list;

import java.util.ArrayList;
import java.util.Scanner;

public class BaseBall1 {

	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			int ranNum = (int) ((Math.random()) * 9) + 1;
			numList.add(ranNum);
			for (int j = 0; j < i; j++) {
				if (numList.indexOf(ranNum) == j) {
					numList.remove(i);
					i--;
				}
//			if (numList.indexOf(ranNum) == -1) {
//				numList.add(ranNum);
//			} else {
//				i--;
			}
		}

		System.out.println(",로 구분하여 숫자 입력");
		Scanner strs = new Scanner(System.in);
		String str = strs.nextLine();
		System.out.println("입력한 숫자 : " + str);
		String[] strNum = str.split(",");
		strs.close();
		
		int cnts = 0;
		int cntb = 0;
		
		while(cnts != 3) {
			cnts = 0;
			cntb = 0;
		
		for (int i = 0; i < strNum.length; i++) {
			if (numList.indexOf(Integer.parseInt(strNum[i])) != -1) {
				if (numList.indexOf(Integer.parseInt(strNum[i])) == i) {
					cnts++;
				} else {
					cntb++;
				}
			}
		}

		if (cnts + cntb == 0) {
			System.out.println("아웃");
		} else {
			System.out.println(cnts + " S " + cntb + " B ");
		}
		}

		System.out.println("정답 : " + numList);
	}
}
