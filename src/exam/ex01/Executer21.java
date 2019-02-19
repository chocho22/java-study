package exam.ex01;

public class Executer21 {
	public static void main(String[] args) {
		Son s = new Son();
		Father f = new Son();
		Object o = new Son();  // new 하면 무조건 다 새로 만드는 것. 덮어쓰는 개념이 아님.
		// StringEqual 클래스 참고.
		System.out.println(s==f);
		System.out.println(f==o);
	}
}
// 클래스간 기능상으로는 아래로 갈수록 커짐.
// 클래스간 상하관계에서는 위로 갈수록 커짐.
