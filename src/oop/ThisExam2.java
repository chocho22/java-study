package oop;

public class ThisExam2 {
	
	
	ThisExam2() {}  // 이 기본 생성자가 숨어있는 것!
	
	ThisExam2(int num1, String str) {
		System.out.println(this.num1);
		System.out.println(this.str);
	}
	
	
	public static void main(String[] args) {
		ThisExam2 te = new ThisExam2(10,"abc");  
		// 10, abc는 ThisExam2(int num1, String str) 여기 들어가는거지 ***
		// this.num1, this.str에 대입되는게 아니라서 실행해도 값은 똑같이 0, null 나옴 ***
		// 아 이거 CalssExam5 클래스 내용에서 내가 궁금했던 점임.
		// ㄴ 여기선 this 변수들에 대입되는게 아니라서임!! ***
		
		// new ThisExam2(10,"abc"); 실행하면 ThisExam2(int num1, String str) {로 가는데,
		// 바로 print 실행하지 않고 ThisExam2 클래스로 가서 선언해둔 변수를 기억해둠.
		// 그래서 10, abc가 아니고 0,null이 출력됨! ***
		
		// 새로 메모리 만들 때 한번 로딩하니까 로딩하면서 읽는다고 함. 그래서 출력된다고.
		// new ThisExam2(); 할 때, ThisExam2() 실행하기 전에! Class 첨부터 끝까지 먼저 읽는다.
		// 따라서 int num1; String str; 이거는 Class 내에 있으면 맨 끝에다 선언해도 가능.
	}
	int num1;
	String str;

}
