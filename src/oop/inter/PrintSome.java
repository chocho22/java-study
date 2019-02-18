package oop.inter;

public interface PrintSome {  // interface 설계도, 정의.
	
	public void printString(String str);  
	public void printChar(char c);
	void printInt(int num);
}// 여기 얘네들 접근제어자는 public.
// interface에서 쓸수있는 접근제어자는 public 하나밖에 없음.
// 따라서 안 써도 앞에 public이 생략되어있음

// interface에는 메소드 선언만 가능하다. 정의는 안됨. 영역 가질수없음.
// ㄴ표준은 아님.???? 하면 안되는건 아닌데 interface에서 그거까지 할필요는 없다..?
// interface에서 데이터타입 선언은 가능함.
// interface에서는 생성자 호출할수없음. 메모리를 생성할수없음.
