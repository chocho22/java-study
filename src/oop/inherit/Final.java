package oop.inherit;

public class Final {
	final int num = 3;  // final int num;만 쓰면 오류. int num; 이면 자동으로 0이 대입되는데,
	// 이건 자바가 하는거라서 num이 변수가 됨. final int num은 상수이기 때문에 오류.
	
	// Final() {
	//			num = 3;
	//			}
	public static void main(String[] args) {
		Final f = new Final();  //final int num이 존재하기 시작하는 순간은 여기서부터.
		// 따라서 여기 이전에만 값을 초기화해주면 오류가 나지 않음. 7~9라인
		System.out.println(f.num);
		//f.num = 3;   //f.num은 이제 상수가 되니까 처음 값을 대입한 다음에 또 대입할수없음.
	}

}
