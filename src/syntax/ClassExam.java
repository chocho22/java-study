package syntax;

public class ClassExam { // 여기서 ClassExam의 데이터타입은 ClassExam. 이건 정해져있는 데이터타입.
	int a = 1; // ClassExam메모리를 생성해서 1을 저장했음.
	char c = '1'; // 얘네의 위치가 어디인지 자바한테 알려줘야 알수있음.
	String s = "1";
	
	void test() {
		System.out.println("난 ClassExam거!");
	}
	public static void main(String[] args) {
		int a = 1;
		ClassExam ce = new ClassExam(); // 자바한테 ClassExam메모리를 생성해달라고 요청함. 
										// ClassExam의 영역을 static 제외하고 다 읽어들임.
		System.out.println(ce.a);
		System.out.println(ce.c);
		System.out.println(ce.s);
		ce.test(); // ClassExam ce = new ClassExam(); 얘 선언한다음 써줘야 호출할수있다!!
		
		ce.a = 3;
		ce = new ClassExam();  // static 제외하고 다 읽어들이기 때문에
		// a가 3이 아니라 다시 1로 초기화 된게 아닐까??????
		System.out.println(ce.a);  // ce = new ClassExam(); 다시 메모리 생성했으니까 1이 출력됨.

		
	}
}

/*
 * 지금까지 변수 선언됐을 때 메소드 영역을 벗어나서 선언 된 적이 없음.
 * 이제 Class 영역에도 변수 선언 할 것임.
 * ce.a  => . 은 '~의' ce의 a
 * 
 * @@@메서드 안에는 메서드 선언못함. java는 Class 기반이니까. function기반이 아님,,,,,,,,,,,,
 * 
 * 이 코드 실행의 시작점은 main 시작라인. 로드(읽어들이는 것)의 시작점이 아니고 '실행'의 시작점.
 * 
 * @@ 배열은 데이터타입을 하나만 가질 수 있음.
 * @@ 그래서 나온게 구조체 - 데이터타입이 달라도 같이 가질 수 있음. => 자바에 없다고함.
 * @@ 구조체에 메서드를 가지게 할 수 있도록 한게 객체.
 * @@ 객체에 상속, 인터페이스, 오버로딩, 오버라이딩 등의 개념을 넣은게 객체 지향 언어,, OOP.
 */