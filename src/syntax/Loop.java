package syntax;

public class Loop {

	public static void main(String[] args) {

		/*
		 * 반복문 - for for(;;) 하면 무한반복됨
		 * i를 for문안에서 선언하면 for문이 끝나게되면 i는 없어짐.
		 * 따라서 for문 밖에서는 i값을 확인할 수 없음.
		 * i값을 for문 밖에서도 확인하고싶으면 i값을 for문 밖에서 선언해야함.
		 */
		int i = 11;
		for (; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println(i);
	}

}
