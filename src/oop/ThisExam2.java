package oop;

public class ThisExam2 {
	int num1;
	String str;
	
	ThisExam2() {}
	
	ThisExam2(int num1, String str) {
		System.out.println(this.num1);
		System.out.println(this.str);
	}
	
	
	public static void main(String[] args) {
		ThisExam2 te = new ThisExam2(10,"abc");  
		// 10, abc는 ThisExam2(int num1, String str) 여기 들어가는거지
		// this.num1, this.str에 대입되는게 아니라서 실행해도 값은 똑같이 0, null 나옴 
		
		// new ThisExam2(); 실행하면 ThisExam2(int num1, String str) {로 가는데,
		// 바로 print 실행하지 않고 4~5번가서 선언해둔 변수를 기억해둠. 그래서 0,null
		
		// 새로 메모리 만들 때 한번 로딩하니까 로딩하면서 읽는다고 함. 그래서 출력된다고.
		// new ThisExam2(); 할 때, ThisExam2() 실행하기 전에 Class 첨부터 끝까지 먼저 읽는다.
		// 따라서 int num1; String str; 이거는 Class 내에 있으면 저 끝에다 선언해도 가능.
	}
	

}
