package oop;

public class ClassExam21 {
	
	int num1 = 7;
	String str = "ccccc";
	
	ClassExam21(int num1, String str) {
		this.num1 = num1;
		this.str = str;
		
		System.out.println(num1);
		System.out.println(str);
	}

	public static void main(String[] args) {
		//ClassExam21 ce21 = new ClassExam21();
//		ClassExam21 ce2 = new ClassExam21(10,"abc");
		System.out.println((new ClassExam21(10,"abc")).num1);
		

	}

}
