package exam.ex03;

public class MethodExam01 {
	public String name = "이초롱";
	
	public static void setTest(MethodExam01 me) {
		me = new MethodExam01();
	}
	public static void main(String[] args) {
		MethodExam01 me = new MethodExam01();
		me.name = "시우";
		MethodExam01.setTest(me);
		System.out.println(me.name);
	}
}
