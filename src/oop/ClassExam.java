package oop;

public class ClassExam {

	int[] nums = new int[3];
	String str = "abc";

	public static void main(String[] args) {
		// static때문에 같은 ClassExam 클래스 안에 있는건데도 str을 못 불러온다고 함.
		ClassExam ce = new ClassExam(); // 여기서 생성된 메모리 없앨 수도 있음. ce = null;
		System.out.println(ce.str);
		ce.str = "바꾸자!";
		System.out.println(ce.str);
		
		for (int i = 0; i < 3; i++) {
			ce.nums[i] = (i + 1) * 10; // 입력단과 출력단 분리시키는 게 좋다.
		}
		for (int j = 0; j < 3; j++) {
			System.out.println(ce.nums[j]); // 입력단과 출력단 분리시키는 게 좋다.
		}

		ce = null; // ce의 메모리 없앰. ce는 방, 안의 변수들은 가구라고 생각하면 됨.
		// ce가 없어졌으니 안에 있던 내용들도 다 못 찾게 된 것.
		System.out.println(ce.str);

	}
}

/*
 * int length = ce.nums.length;
 * for(int i = 0;i<length;i++) {
 * 		ce.nums[i] =(i+1)*10;
 * } for(int j = 0;j < length;j++) {
 * 		System.out.println(ce.nums[j]);
 * }
 */
