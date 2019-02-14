package oop;

public class ClassExam2 {
	String[] strs;
	int num;
	double db;
	boolean bl;
	char c;
	
	public static void main(String[] args) {
		ClassExam2 ce = new ClassExam2();
		//ce.strs[0] = "1";  
		System.out.println(ce.strs);
		// strs 배열 초기화 안했는데 이렇게 쓰면 null이 찍힘. 
		//  ㄴ> 다른 변수들도 마찬가지로 기본값으로 모두 초기화함.
		// @@정해져있지 않은 데이터타입=레퍼런스(참조형) 데이터타입(다 대문자로 시작함)
		//   (ex.String, 여기서 ClassExam2 등) 은 모두 *null로 초기화됨.
		System.out.println(ce.num);
		System.out.println(ce.db);
		System.out.println(ce.bl);
		System.out.println(ce.c);  // 출력 안된거 아님. "" <- 빈문자를 출력함.
	}
}
