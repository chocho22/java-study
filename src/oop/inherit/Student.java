package oop.inherit;

class People{  // 클래스 앞에 final 붙으면 절대 재정의 할 수 없음. 상속도 못 함.
	// 따라서 final이면 확정판. 최종. 수정 불가. 재정의 불가.
	// String 클래스도 final. 따라서 String 클래스도 상속 할 수 없음.
	String name;
	People() {
		this("무명");
	}
	People(String name) {
		this.name = name;
	}
	void printInfo() {   
		// 원래 11라인과 24라인은 오버라이딩 할 수 있었음.
		// 그런데 void 앞에 final이 붙으면 오버 라이딩 불가.
		// 메소드에 final 붙으면 절대 재정의 할 수 없음.
		System.out.println("이름 : " + name);
	}
}
public class Student extends People {
	int grade;
	Student(int grade) {
		// super(); => 이게 생략되어 있음. 안 써줘도 됨.
		// 안써주면 기본생성자라서 위에 People()로 올라감.
		super("사람");
		this.grade = grade;
	}
	
	void printInfo() {
		System.out.println("학년 : " + grade);
		System.out.println("이름 : " + name);
	}
	public static void main(String[] args) {
		Student st = new Student(3);
		st.printInfo();
	}
}
// 생성자는 오버로딩은 되는데 오버라이딩은 안됨.
// 생성자는 클래스 이름과 동일하고, 데이터 타입이 없고, 자기 영역을 가짐.