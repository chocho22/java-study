package syntax;

public class GuGuDan {

	public static void main(String[] args) {
		for (int j = 9; j > 0; j--) {
			for (int i = 9; i > 0; i--) {
				System.out.print(j + " X " + i + " = " + (j * i));
				if (i != 1) {
					System.out.print(", ");
				}

			}
			System.out.println();
		}
	}
}

//숫자+문자=문자
//if(i!=9) {
//System.out.print(","); }