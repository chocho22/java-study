package oop;

public class ThisExam {
	int num = 10;
	
	void setNum(int num) {
		this.num = num;   // 여기 생략된게있음. (this.)num = num;
	}
	
	int getNum() {
		return this.num;   // 여기 생략된게있음. return (this.)num;
	}
	public static void main(String[] args) {
		ThisExam te = new ThisExam();
		System.out.println(te.num);
		System.out.println(te.getNum());
		te.setNum(5);
		System.out.println(te.num);
		System.out.println(te.getNum());
	}
	
	

}
