package exam.ex04;

public class Execute {

	public static void space(Action p) {
		p.sleep();
//		if(p instanceof Cat) {
//			((Cat)p).eat("사료");
//		}
	}
	
	public static void main(String[] args) {
		Action c = new Cat();
		Action p = new Person();
		
		space(c);
		space(p);
	}
}
