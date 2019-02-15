package oop.inherit;
  // 모든 클래스는 object 클래스를 상속받음. object 클래스는 안보여도 디폴트로 존재함.
  // object 클래스가 모든 클래스의 최상위 클래스.
class GrandFather {
	void work() {
		System.out.println("할아버지가 농사를 짓습니다.");
	}
}
// super 상위 확장자 실행. 위에거. (ex. super.work();)
// this 는 나 (ex. this.work();)
class Father extends GrandFather {  // extends 확장자
									
	void work() {
		super.work();
		System.out.println("아빠가 일함.");
	}
}
public class Son extends Father {
	void work() {
		super.work();
		System.out.println("아들이 공부함.");
	}
	// 오버라이드 : 여기선 Father의 work에 Son의 work를 덮어씀.
			// 아빠거는 그대로 들고있는 상태에서 아들거가 위로 올라탐.
			// 오버라이딩 조건
			// 	1. 무조건 상속이 시작 2. 메소드의 이름과 메소드의 데이터 타입이 같아야 함
			// 	3. 파라메터 데이터 타입 갯수 순서까지 동일해야 함
			
			// cf) 여기서 파라메터가 달라지면 work메소드 종류가 2개가 되니까 오버로딩
			// 오버로딩 : 1. 같은 영역에 있어야함 2. 메소드명이 같아야함 (데이터타입은 상관없음)
			//				3. 파라메터의 갯수, 데이터타입, 위치 등이 달라야함
	public static void main(String[] args) { // public 접근제어자
		Son s = new Son();
		s.work();
	}
}
