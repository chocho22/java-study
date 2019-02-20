package oop;

public class ClassExam5 {
	int a = 2;
	
	ClassExam5() {
	System.out.println("난 기본 생성자.");
	}
	
	ClassExam5(int a) { // 생성자의 정의임. 메소드하고 비슷. 얘도 오버로딩 됨.
		// 메소드하고 마찬가지로 같은 생성자명이면 파라미터의 데이터타입이나 개수가 달라야함.
		System.out.println("난 기본 생성자가 아님.");
	}
	
	public static void main(String[] args) {
		ClassExam5 ce = new ClassExam5(1);  // 라인 나타내는 숫자 왼쪽 더블클릭하면 Break Point 생김.
		// 브레이크 포인트 하면 이 부분만 실행됨
		// 거기서 Alt+Shift+D 누르고 J 누르면 디버깅 시작할수있음!.
		// ㄴF5 = 실행구가 시작되는 지점으로 이동, 다음 순서로 한번씩 넘어감.
		// ㄴF6 = 한줄씩 순서대로 실행????
		// ㄴF8 = 디버깅 종료
		ce.a = 4;
		(new ClassExam5(1)).a = 4;
		System.out.println(ce.a);
		ce = new ClassExam5();
		System.out.println(ce.a);
		System.out.println((new ClassExam5(1)).a);
		// new ClassExam5(1) 에서 1은 확장 생성자를 불러오기 위한 조건? 같은거라는건 알겠는데
		// 왜 확장생성자를 불러와도 ClassExam5의 a가 출력되는걸까,,,,
		// ㄴ 아 5(int a)의 a는 10~13라인에서만 살아있는 거라서 그런 거 같다!
		//	ㄴ 5(int a)의 a를 int a의 a에 대입을 안했잖아욧!!! 그래서 그렇다!!!!!!!!!
		//	 ㄴ 암튼!!그렇다!!!!!!!!!!!!!!!!!
		// 이게 오버로딩을 설명한다는건 알겠음.

	}  // new ClassExam5() 하면 ClassExam5()를 저장할 수 있는 메모리를 새로 만든다는 뜻
	// 클래스 이름과 동일하고 대문자로 시작하면 생성자

}  // 생성자는 초기화 할수있어서 좋다????????????????????????????????????
// 생성자는 메모리 생성과 동시에 대입해서 속도가 더 빠르다.
// 메소드는 메모리를 생성한 다음 다시 작업해서 시간이 더 걸린다.?????
