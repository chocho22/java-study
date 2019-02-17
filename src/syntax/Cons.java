package syntax;

public class Cons {
	Cons() {
		System.out.println("생성자 호출!");
	}

	public static void main(String[] args) {
		Cons c = new Cons(); // 여기서 Cons();는 메소드의 호출임.???????????????????
		// Cons();는 Cons 클래스 메모리를 생성한거 아닌 가 ? ?????? ?????
	}
}
/*
 * Constructor : 생성자. 메소드와 비슷함.!! 비슷함~!
 * new Cons(); => 여기서 new는 새로운 메모리를 만든것임
 * ㄴ생성자가 포함되어있는 Class에 대한 메모리를 만들어줌.
 * 		따라서 생성자의 데이터타입은 있을수없음.????
 * 		(생성자의 데이터타입은 그 클래스 이름 아녀????????????)
 */
