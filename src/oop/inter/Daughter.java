package oop.inter;

import oop.inherit.Mother;

public class Daughter extends Mother {  // Daughter하고 Mother하고 같은패키지에 있으면 같이 사는거..
	
	public static void main(String[] args) {
		Daughter d = new Daughter();
		System.out.println(d.money);
		System.out.println(d.getMoney());
	}
}  // 패키지가 달라지면 영역이 달라지니까 money, getMoney 오류남.
// 패키지, 영역 같아지면 디폴트라도 가져다 쓸수있음.

//영역 : 가장 큼 - 공공의, 보호된??, 기본적인, 개인적인 - 가장 작음
//접근제어자 4개 : public, protected, default, private
//		public, private를 자주 쓰게 될 것..

// public이면 영역이 달라도 가져다 쓸 수 있음.  ***
// protected 하면 패키지, 영역이 달라도 상속을 받으면!!!! 가져다 쓸 수 있음.
// ㄴ main이 Daughter에 있으니까 Daughter가 Mother를 상속받았기 때문에
//  ㄴ Daughter 안에서는 쓸 수 있는것!!!! 다른 클래스에서는 상속을 안받아서 못 쓴다.
// default는 무조건 같은 패키지 안에서만 쓸 수 있음. 상속 안받아도 됨.
// private는 같은 패키지, 영역에 상속을 받아도 무조건 쓸 수 없음.  ***
