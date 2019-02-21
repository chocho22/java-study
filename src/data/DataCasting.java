package data;

public class DataCasting {
	
	public static void main(String[] args) {
		Byte b = new Byte((byte)10);  // byte와 매핑되어있는 클래스
		Short s = new Short((short)10);  // short와 매핑되어있는 클래스
		Integer i = new Integer(10);  // int와 매핑되어있는 클래스 - 랩퍼 클래스로 제일 많이 사용함 Integer.parseInt(String->int)
		Long l = new Long(10);  // long과 매핑되어있는 클래스 - 랩퍼 클래스로 제일 많이 사용함
		
		Float f = new Float(1.2f);  // float과 매핑되어있는 클래스
		Double d = new Double(1.2);
		
		Character c = new Character('c');  // char와 매핑되어있는 클래스
		Boolean bl = new Boolean(true);  // boolean과 매핑되어있는 클래스
		
		String numStr = "123.5";
		d = Double.parseDouble(numStr);
		int num = d.intValue();
		System.out.println(num+1);
		double db = Double.parseDouble(numStr);
		System.out.println(db+1);
	}
}
