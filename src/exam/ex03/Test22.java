package exam.ex03;

public class Test22 {
	
	public static int num = 1;
	
	public static void main(String[] args) {
		Test22[] ts = new Test22[3];
		for(int i=0;i<ts.length;i++) {
			ts[i] = new Test22();
			ts[i].num = i;
		}
		for(int i=0;i<ts.length;i++) {
			System.out.println(ts[i].num);
		}
		Test22 t3 = new Test22();
		System.out.println(t3.num);
	}
}
