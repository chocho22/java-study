package exam.ex02;

public class IntArray {

	public int[] nums = new int[10];
	public boolean compare(int num) {
		for(int i = 0 ; i < nums.length ; i++) {
			if (nums[i]==0) return false;  // () 조건일 때, return false 해서 메소드 자체를 나감.
			// if () return false;  이렇게 한줄로 자주 씀. 한줄일땐 자기영역 표시 안해줘도 됨.
			// 처음에 선언하고 초기화를 안하면 int의 기본값 0이 들어가니까,
			// nums[i]==0 이라는건 값이 초기화가 안되었다는 뜻. 숫자가 대입이 안되었다는 것.
			if (nums[i]==num) return true;
			}
		
		return false;
	}
	public static void main(String[] args) {
		IntArray ia = new IntArray();
		
		for(int i = 0 ; i < ia.nums.length ; i++) {
//			ia.nums[i] = (int)(Math.random()*10)+1;
			int num = (int)(Math.random()*10)+1;
			// 대입하고나서 비교하는게 아니라 변수를 선언해서 변수와 배열들의 값을 다 비교한 후에
			// false가 나오면 else로 넘어가서 배열에 대입.
			if(ia.compare(num)) {  // if () 안에는 데이터타입 boolean만 들어갈수있음.
				i--;
				} else {
					ia.nums[i] = num;
				}
			}
		
		for (int i = 0; i < ia.nums.length; i++) {  // 반복1
			for (int j = i + 1; j < ia.nums.length; j++) {  // 반복 1 안에서 반복2
				if (ia.nums[i] < ia.nums[j]) {
					int tmp = ia.nums[i];
					ia.nums[i] = ia.nums[j];
					ia.nums[j] = tmp;
				}
			}
		}
		for (int i = 0; i < ia.nums.length; i++) {
			System.out.println("ia.nums[" + i + "]=" + ia.nums[i]);
		}
		
//		for(int i = 1 ; i<10 ; i++) {
//			for(int j = 1 ; j<10 ; j++) {
//				System.out.print(i + " X " + j + " = " + (i*j));
//				if(j!=9) {
//					System.out.print(", ");
//				}
//			}
//			System.out.println();
//		}
	}
}
