package exam.ex01;

public class StringEqual3 {
	String str = "1";
	public static void main(String[] args) {
		StringEqual3 se1 = new StringEqual3();
		System.out.println(se1.str);
		StringEqual3 se2 = new StringEqual3();
		System.out.println(se1.str==se2.str);  // true.
		// String str = new String("1"); 한다음 print 실행하면 false.
		// ㄴ 호출할때마다 새로운 메모리를 생성하니까.
	}
}
