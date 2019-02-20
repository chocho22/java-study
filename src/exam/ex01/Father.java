package exam.ex01;

public class Father {
	public String toString() {  // String 클래스의 toString은 Object 클래스에 이미 선언되어있음.
		// 그래서 String을 void 로 바꿔줄 수 없다. 메소드를 toString1로 바꿔주면 void로 가능.
		// 혹은 () 안에 파라미터 넣어주면 void로 가능. 이럴 땐 오버로딩.
		return "아빠클래스";
	}
	
	public void printInfo() {  // 이렇게 하면 Object보다 Father의 기능이 더 많다.
		//그래서 벤다이어그램이 아님.
		System.out.println("아빠를 소개하지!");
	}

}
// 선택 후 Ctrl + /(슬래시) 누르면 주석 처리됨.