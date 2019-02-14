package syntax;

public class AreaCondition {
	
	public static void main(String[] args) {
		int i = 2;
		
		if(i<5) {
			System.out.println("i는 1");
		} else if(i<10) {
			System.out.println("i는 10보다 작다");
		} else if(i>10) {
			System.out.println("i는 10보다 크다");
		} else {
			System.out.println("i는 10이다");
		}
	}

}
