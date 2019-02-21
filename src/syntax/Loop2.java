package syntax;

public class Loop2 {

	public static void main(String[] args) {
//		int i = 10;
//		for(;i >=0;i--) {
//			System.out.println(i);
//		}
//		for(int j = 10 ; j > 0 ; j--) {
//			for(int k = 0 ; k < j ; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		for(int i = 1 ; i <= 9 ; i++ ) {
			for(int j = 1 ; j <= 9 ; j++) {
				System.out.print(i + " X " + j + " = " + i*j);
				if(j!=9) {
					System.out.print(", ");
				}
			}
			System.out.println();
		}
	}
}
