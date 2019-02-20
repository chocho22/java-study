package exam.ex04;

public class Cat implements Action {

	@Override
	public void speek() {
		System.out.println("야옹");
	}

	@Override
	public void sleep() {
		System.out.println("시리가 잔다.");
	}

	@Override
	public void eat() {
		System.out.println("시우가 밥 먹는다.");
	}
	
//	public void eat(String foodName) {
//		System.out.println("시우가 " + foodName + " 먹는다.");
//	}

}
