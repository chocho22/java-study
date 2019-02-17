package oop;

public class ClassExam3 {

	int num = 1;
	// 실행구는 Class 바로 밑에 쓸수없음.
	// 로딩이나 변수선언, 초기화, 메소드 정의가 아닌, 실행을 하려면
	// 바로는 할 수 없고 자기만의 다른 영역을 갖고 있는 곳에만 할 수 있음. {} 안에!

	void setNum(int num) {  // void setNum(int num) -> 이 num은 int num = 1 얘하고 다른 num.
	}

	int getNum() {
		return num;  // return num -> 이 num은 int num = 1 얘하고 같은 num.
	}
	

	public static void main(String[] args) {  // main - 여기는 실행구  
	// main 포함 어떤 메소드도 Class 밖에서 선언할수없음
		ClassExam3 ce = new ClassExam3();
		// ClassExam3() 선언된게 없는데 쓸수있는건 ClassExam3()얘가 기본생성자라서.
		// 안보여도 ClassExam3(){ } 이게 클래스 안에 있음.
		// 저장해야 컴파일되어서 Class파일로 만들고, 실행하면 Class파일을 실행함.
		// 글서 저장안하면 실행안됨
		System.out.println(ce.num);
		ce.num = 5;
		System.out.println(ce.getNum());
		ce = new ClassExam3();
		System.out.println(ce.getNum());
		//ce.setNum(숫자);  // 이렇게 호출하면 5번라인에 있는 num하고 같아짐.
	}
}
