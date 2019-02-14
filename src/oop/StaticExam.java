package oop;

public class StaticExam {
	
	static int num = 1;  // static 붙여주면 자바가 static으로 되어있는걸 우선적으로 읽어들임.
	
	public static void main(String[] args) {  // 이걸 실행하면 
		// main 실행구 실행 전에 자바가 static으로 되어있는걸 우선적으로 읽어들임.
		//원래 존재 여부를 알려줘야하지만 static을 쓰면 안해도 자바가 잘 읽어줌.
		//static으로 되어있는건 초기화를 한번만 함.
		System.out.println(num);
		// (StaticExam.)num <- (StaticExam.)이 생략되어있음.
		// System.out <- 이거도 비슷
	}
}
