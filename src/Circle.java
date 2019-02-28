
public class Circle {

	final static int N = 10;

	public static void main(String[] args) {

		for (int i = -N; i <= N; i++) {
			for (int j = -N; j <= N; j++) {
				if (i * i + j * j <= N * N) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
