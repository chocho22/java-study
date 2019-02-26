package collection.list;

import java.util.ArrayList;
import java.util.Scanner;

public class Game1 {

	public static void main(String[] args) {

		ArrayList<Integer> numList = new ArrayList<>();

		for (int i = 0; i < 3; i++) {
			int num = (int) (Math.random() * 9) + 1;
			if (numList.indexOf(num) != -1) {
				i--;
			} else {
				numList.add(num);
			}
		}
		int cntS=0;
		int cntB;
		while (cntS != 3) {

			System.out.println(",로 구분하여 숫자 입력");
			Scanner strs = new Scanner(System.in);
			String str = strs.nextLine();
			System.out.println("입력한 숫자 : " + str);
			String[] strList = str.split(",");

			cntS = 0;
			cntB = 0;
			for (int i = 0; i < 3; i++) {
				int nums = Integer.parseInt(strList[i]);
				if (numList.indexOf(nums) != -1) {
					if (numList.indexOf(nums) == i) {
						cntS++;
					} else {
						cntB++;
					}
				}
			}

			if (cntS + cntB == 0) {
				System.out.println("아웃");
			} else {
				System.out.println(cntS + " S " + cntB + " B ");

			}
			strs.close();
		}
		System.out.println("정답 : " + numList);
		
	}

}
