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
		// 거기서 Alt+Shift+D 누르고 J 누르면 한줄씩만 실행됨.
		// ㄴF5 = 실행구가 시작되는 지점으로 이동
		// ㄴF6 = 브레이크 포인트 한줄 실행
		// ㄴF8 = 디버깅 종료
		ce.a = 4;
		(new ClassExam5(1)).a = 4;
		ce = new ClassExam5();
		System.out.println(ce.a);
		System.out.println((new ClassExam5(1)).a);

	}  // new ClassExam5() 하면 ClassExam5()를 저장할 수 있는 메모리를 새로 만든다는 뜻
	// 클래스 이름과 동일하고 대문자로 시작하면 생성자

}  // 생성자는 초기화 할수있어서 좋다????????????????????????????????????
// 생성자는 메모리 생성과 동시에 대입해서 속도가 더 빠르다.
// 메소드는 메모리를 생성한 다음 다시 작업해서 시간이 더 걸린다.?????
