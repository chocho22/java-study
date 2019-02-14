package method;

public class VoidMethod {

	
	static void test(int startNum, int endNum) {
		for (int i = startNum; i <= endNum; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		test(10,30);
	}

}

//메서드의 타입은 두가지. 넘기는거(return;), 안넘기는거(void)
//여기서 test의 타입은 void
//따라서 String str = test(10,30); 에러난다. 대입할수없음.????????
