package oop;

public class ClassExam6 {
	int[] nums;
	ClassExam6() {
		nums = new int[3];
	}
	ClassExam6(int a, String str, String str2) {
	}
	ClassExam6(String str, int a, String str2) {
	}
	public static void main(String[] args) {
		ClassExam6 ce = new ClassExam6();
		ce.nums[0] = 1;
		ClassExam6 ce3 = new ClassExam6(1,"a","b");
		ce3.nums[0] = 3;
	}
}
