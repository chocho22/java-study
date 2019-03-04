package oop.abst;

interface Test{
	public void play();
	public void run();
}
class Child extends AbstractTest {
//	@Override
//	public void play() {
//		
//	}
	@Override
	public void run() {
		
	}
}
public abstract class AbstractTest implements Test {
	AbstractTest() {
		System.out.println("abstract 클래스로는 메모리를 생성할 수 없지만,"+
				"기본생성자는 만들 수 있다.");
	}
	public final void play() {
		System.out.println("놀자");
	}
	public static void main(String[] args) {
		AbstractTest at = new Child();
		at.play();
	}
}
