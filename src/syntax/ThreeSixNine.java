package syntax;

public class ThreeSixNine {
	public static void main(String[] args) {
		int j = 30;
		int[] t = new int[j];
		for (int i = 1; i < t.length; i++) {
			int mod = i % 10;
			if (mod != 0 && mod % 3 ==0) {
				System.out.print("짝 ");
			} else {
				System.out.print(i + " ");
			}
		}
	}
}

/*int mod = i % 10;
if (mod == 3 || mod == 6 || mod == 9) {
	System.out.print("짝 ");
} else {
	System.out.print(i + " ");
}

int mod = i % 10;
if (mod != 0 && mod%3==0) {
	System.out.print("짝 ");
} else {
	System.out.print(i + " ");
}
*/