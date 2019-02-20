package oop.inherit;

//import java.util.Scanner;  // 아래 Scanner에서 에러날 때 Ctrl+Shift+O 눌러주면 여기서 Scanner의
							// 존재 이유를 알려줌.

class Book {
	String name;
	Book(String name) {
		this.name = name;
	}
	Book() {
		this("자바의 정석");  
		// 여기서 this 는 Book을 의미하는데, 그중에 String data type인 Book을 의미.
	}  // this.name = "자바의 정석";   =>   this("자바의 정석");   Book(){ --- } 을 호출한 것.
// this도 디자인 패턴 - 디자인 패턴 Model View Control(MVC)는 스프링 들어가기전에 배우게 될 것..
}
public class ConsExam extends Book {  // 확장하면 Book의 기본생성자로 올라가야 함.
	ConsExam() {
		super();   // 22라인에서 오류가 안난이유는 이게 기본생성자로 숨어있었기 때문.
	}
	public static void main(String[] args) {
		ConsExam ce = new ConsExam();
		System.out.println(ce.name);
		
		//Book b = new Book();  // Book이라는 클래스를 데이터 타입으로 사용할 수 있다.
		//System.out.println(b.name);
		
		//String str = new String("abc");  // 여기 String은 String 클래스의 기본 생성자.
		//Scanner scan = new Scanner(System.in);
		
		//int num = Integer.parseInt("1");
		// 여기서 Integer. 위치에 있는 클래스의 역할은 형변환. 감싸주기. 랩퍼(wrapper)클래스.
	}

}

// 기본 생성자, 생성자를 오버로딩으로 나눈 이유는
// 디폴트값이 있을 수 있고 다른 값을 대입하게 될 수도 있으니까..
// String은 참조형 데이터 타입. 클래스도 변하는 데이터 타입. 따라서 String도 클래스.