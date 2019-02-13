package data;

public class StringType {

	public static void main(String[] args) {
		
		String str = "123";
		System.out.println(str+123);
		String str2 = new String("123");
		System.out.println(str.equals(str2));
		
		//str.equals(str2) : str과 str2가 보는 '값'이 같은지
		
		//숫자라고 해도 문자가 더해지면 무조건 문자가 됨.
		
		/*
		 * GIT - 메일같은 서비스
		 * github - 메일서비스를 제공해주는 회사같은거
		 */
	}
}
