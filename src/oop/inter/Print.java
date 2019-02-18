package oop.inter;

import oop.inherit.Animal;
// Animal과 같은 패키지에 있지 않아서 import 해야 Animal 데이터타입을 쓸 수 있음.

public class Print implements PrintSome {  // implements : 구현. 상속하고 비슷한 개념임.

	@Override
	public void printString(String str) {
		// public 접근제어자 왜 자동으로 생기는지.
		// public같은게 안 붙어있으면 아무것도 없는 접근제어자. 디폴트 접근제어자임.
		System.out.println(str);
	}  // interface에 선언되어있는 메소드를 꼭 한번은 정의 해 줘야 함. 오버라이드.

	@Override
	public void printChar(char c) {
		System.out.println(c);
	}

	@Override
	public void printInt(int num) {
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		Print p = new Print();
		p.printString("abc");
		
		PrintSome ps = new Print(); // => 메모리가 없으니까..선언만 해서는 할 수 있는게 없다.....
		// ㄴ new Print();를 대입 할 수 있다고 함......
		Animal a = new Animal();  // import 안하면 선언 못 함. Ctrl + Shift + O
		a.run();
		// run의 접근제어자를 public으로 바꿔주면 이렇게 아무데서나 run메소드를 쓸 수 있게 됨.
	}
}

// 영역 : 가장 큼 - 공공의, 보호된??, 기본적인, 개인적인 - 가장 작음
// 접근제어자 4개 : public, protected, default, private
//		public, private를 자주 쓰게 될 것..