package exam.ex01;

public class StringEqual {
	public static void main(String[] args) {
		
		String str1 = "abcd";  // 메모리 new String 만들어서 "abcd" 대입. 원래 new String("abcd");
		String str2 = new String("abcd");  // String str2 = "abcd"; 이미 있어서 메모리를 안 만든다.
		// String str2 = new String("abcd"); 은 new String 새로 만들어줘 라서 다시 메모리 만들어줌.
		System.out.println(str1==str2);
		// System.out.println(str1.equals(str2)); 를 써주면 '값'이 같은지 물어보는 것!!
		System.out.println(str1=="abcd");
		// 이걸 실행할 때 "abcd"를 어디에는 저장을 해야하는데, 이미 저장된게 있어서
		// 저장되어 있던 "abcd"값을 가져옴. 
		// (str1=="abcd") 에 있는 "abcd"는 new String 하지 않았기 때문에!
		System.out.println(str2=="abcd");
		// 상동
		"abcd".equals(str2);  // =>  str2 == "abcd"; 
		boolean bl = str1 == "abcd";
	}
}
//.equals  => String의 메소드임. '값'이 같은지 물어보는 것!!
// ==  => 이거는 값을 비교하는게 아니라 메모리 주소가 같은지 물어보는 것!!