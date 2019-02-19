package exam.ex02;

import java.util.Scanner;

public class StringArray {
	
	public String[] strs;  // 정해져있지 않은 데이터타입의 배열이니까 null이 찍힘.
	// 배열 초기화 해주려면!!!!!!  1. 여기 선언하자마자 바로 초기화 해주든가,
//	public StringArray() {
//		strs = new String[5];  // 2. 기본생성자에 초기화 해주든가,
//	}
	public static void main(String[] args) {
		StringArray sa = new StringArray();  // 이게 오류나지 않는 이유는,
		// 생성자가 아예 없어서 기본생성자가 숨어있거나, 기본생성자를 만들어둬서.
		// 파라미터가 있는 생성자만 있을 경우에는 기본생성자를 만들어줘야 오류가 나지 않는다.
//		sa.strs = new String[5];  // 3. StringArray 생성자 메모리 만든 후 여기에 초기화 해줘도됨.
		System.out.println("5개의 글자를 , 를 기준으로 입력해주세요.");
		Scanner scan = new Scanner(System.in);  // 여기서 in은 static. static이 아니면
		// new 하고 메모리 생성해서 읽어줘야함. static은 그렇게 할 필요없이 바로 읽어주니까.
		// static 변수는 이클립스에서 글꼴이 기울어지게 해준다.
		// scan : Resource leak. 메모리 낭비, 유출. scan.close(); 해주면 메모리 낭비가 없어짐.
		// 그러니까 사용 다 했으면 close 해주기.
		// new Scanner(System.in);  =>  (System.in) 한 이유는, Scanner의 기본생성자가 없어서.
		// System.in  => System중에서 in, 콘솔 창과 연결.
		String input = scan.nextLine();
		System.out.println(input);
		sa.strs = input.split(",");  // , 기준으로 split해서 sa.strs의 배열에 차레대로 저장, 리턴.
		// split은 메소드. split(",")의 데이터타입 스트링 배열. 그래서 strs에 대입할수있음.
		// String 클래스에 split이라는 메소드가 있음. 데이터타입이 스트링 배열임.
		// 입력하면 split이 그거에 맞춰 new 해서 인덱스수를 수정하고 값을 대입해서 그걸 strs에 넘겨줌.
		// 따라서 배열의 방 개수가 달라질수있음.
		System.out.println("검색할 단어를 입력해주세요.");
		String search = scan.nextLine();
		for(int i = 0 ; i < sa.strs.length ; i++ ) {
			if(search.equals(sa.strs[i])) {  // ==는 값이 아니고 메모리 주소가 같은지 비교하는것.
				// 값을 비교하려면 .equals 를 써야함.
				System.out.println("sa.strs[" + i + "]=" + sa.strs[i]);
			}
		}
//		for(int i = sa.strs.length-1 ; i >= 0 ; i-- ) {
//			System.out.println("sa.strs[" + i + "]=" + sa.strs[i]);
//		}
		scan.close();
	}
}
// String 쓸 때에는 == 보다는 .equals 를 써주는게 좋다. 어차피 값을 비교하는게 많이 나오니까.