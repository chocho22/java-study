package method;

public class Methods {

	static String getStr() {
		return"abc";
	}
	static void setStr(String str) {
		System.out.println(str);
	}
	public static void main(String[] args) {
		setStr("abc");  //setStr 타입 void. void라는 데이터타입은 없어서 void로는 변수를 선언할수없음.
		String str = getStr();
		System.out.println(str);
	}
}
//오버로딩의 전제조건은
//1. 같은 영역에서 쓸 수 있어야 하고
//2. 메소드명이 같아야하고
//3. 파라미터(메소드 옆 ())의 갯수나 데이터타입이 달라야함.
//(같은 데이터타입 파라미터가 여러개일 땐 순서가 달라도 됨)


/*
 * @리턴하는 것 => 대입 가능(같은 데이터타입이면), 호출 가능
 * @리턴하지 않는것 => 호출만 가능
 * 
 * @자판기 = 돈을 넣고, 제품 선택(파라미터 두개) - 리턴 결과값으로 제품이 나옴 => 리턴하는 것
 * @전망대 망원경 = 돈 넣으면 일정 시간동안 열렸다가 끝나면 닫힘. 끝. - 리턴 결과값이 없음 => 리턴하지 않는것
 */
