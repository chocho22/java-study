package exam.ex01;

public class Executer {
	public static void main(String[] args) {
		Object f = new Father();  // Father f = new Father(); 에서 Father를 Object로 바꿀수있다.
		// 부모가 가진 메소드를 자식은 알 수 있음.
		// 자식이 가지고있는 메소드를 부모는 모름. 그래서 f.printInfo(); 안됨.
		// Object f = new Father(); 이거도 데이터타입을 Object에서 Father로 캐스팅 해준 것.
		Object f1 = new Father();
		Son s = new Son();  // Father s = new Son(); 가능. <= Son이 Father를 상속받아야 가능함
		Father f2 = new Father();
//		f2 = new Son();  // <= Son이 Father를 상속받아야 가능함
//		Object o = f1;   // Father f1 = new Father(); 에서 이거로 업캐스팅함.
//		Father f2 = (Father)o;  // o를 Father로 다운캐스팅함.
		// Son f2 = (Son)o;  <= Son을 Object라고 부를 수 있지만, 얘는 오류남.???
//		o.printInfo(); //  <= 얘는 에러남. o의 데이터타입이 Object이기 때문에.
		// ㄴObject를 Father라고 부를수 없어서.
		// Father f3 = new Object(); <= 얘는 안됨. Object를 Father라고 부를수 없어서.
		// Father f3 = (Father)new Object(); // 캐스팅해도 안됨. Object를 Father라고 부를수 없어서.
		f2.printInfo();  // <= 얘는 에러 안남.
//		Son s2 = new Son();
//		System.out.println(s2.toString());
		System.out.println(f.toString());
//		Object o = new Son();  // 메모리를 Son으로 생성해서! ㄱ
//		System.out.println(o.toString());  // Son의 toString이 오버라이딩됨.
		Object obj = new Son();
		Father f3 = new Father();
		Son s1 = new Son();
		f3.printInfo();  
		s1.printInfo();
//		f3 = s1;  // 대입 됨.
//		obj = s1;  // 대입 됨.
//		obj.toString();
//		s1.toString();
		// Father의 toString 지우고나서 obj, f3, s1.toString 하면 실행 되는 이유는, ?? 안되는데?
		// obj, f3은 Object에 toString이 있어서이고, s1은 Son에 toString이 있어서이다.
		
		Object[] objs = new Object[3];
		objs[0] = obj;  // objs 배열의 데이터타입은 Object라서 세개 다 대입 가능.
		objs[1] = f3;
		objs[2] = s1;
		// objs[1].printInfo();  <=  objs[1]의 데이터타입이 Object라서 안됨.
		// Object에는 printInfo가 없음.
		((Father)objs[1]).printInfo();  // Object에서 Father로 다운캐스팅 해줘서 Father에 있는
		// printInfo를 실행함.
		// ((Father)objs[1]).printInfo();   =>   Father f4 = (Father)objs[1]; + f4.printInfo();
	}
}
// 메모리주소는 Object의 toString이 실행되어서 나오는 것..