package exam;

import java.util.Scanner;

class Dog {
	int dn;
}

class Cat {
	int cn;

}

class Food {
	int fn;
}

public class Test0215 {

	public static void main(String[] args) {
		
		System.out.println("고양이와 강아지에게 먹이를 주세요!!!!!!");
		
		int j = 20000000; //@@
		Cat[] cats = new Cat[j];  //@@
		for (int i = 0; i < cats.length; i++) {
			cats[i] = new Cat();
			cats[i].cn = i;
		}

		Dog[] dogs = new Dog[j];  //@@
		for (int i = 0; i < dogs.length; i++) {
			dogs[i] = new Dog();
			dogs[i].dn = i;
		}

		Food[] foods = new Food[j];  //@@
		for (int i = 0; i < foods.length; i++) {
			foods[i] = new Food();
			foods[i].fn = i * 2;
		}
		
		Scanner input = new Scanner(System.in);  //@@
		int i = input.nextInt();
		
		if ((i > 0) && (i < 20000000)) {
			// System.out.println("시리 시우 사랑해!!!!!!!!!!");
			System.out.print("고양이가 " + cats[i].cn + "마리, ");
			System.out.println("강아지가 " + dogs[i].dn + "마리 있다면");
			System.out.println("먹이 " + foods[i].fn + "마리 분이 필요합니다.");
		} else if((i <= 0) || (i%1!=0)) {
			System.out.println("숫자를 입력해주세요.");
		} else {
			System.out.println("더 작은 숫자를 입력해주세요.");
		} 
		
		Scanner input2 = new Scanner(System.in); 
		int i2 = input2.nextInt();
		if (i2 == i*2) {
			System.out.println("감사합니다~~~~^^");
		} else {
			System.out.println("다시 주세요ㅠㅠ");
		}
	}
}
// j하고 i