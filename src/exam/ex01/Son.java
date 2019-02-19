package exam.ex01;

public class Son extends Father {
	public String toString() {
		return "아들클래스";
	}
	
	public void printInfo() {  // 상속받은 Father에 printInfo가 이미 선언되어 있어서
		// 오버라이딩 하려면 데이터타입을 맞춰줘야 함. 그래서 void가 아니면 안됨.
		// 상속 안하면 데이터타입은 하고싶은 거 하면 됨.
		System.out.println("내소개를 시작하지");
	}
}
