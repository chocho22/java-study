package exam.ex01;

public class ObjectArray {
	public static void main(String[] args) {
		Object[] objs = new Object[4];
		for(int i = 0 ; i < objs.length ; i++) {
			if(i%2==0) {
				objs[i] = new StepMother();  // objs[i] = new Father();
			}else {
				objs[i] = new Son();
			}
		}
		for(int i = 0 ; i < objs.length ; i++) {
//			((Father)objs[i]).printInfo();  // Son도 Father라고 부를 수 있으니
			// Father로 캐스팅해주면 Son일땐 Son, Father일땐 Father를 실행해 줌.
//			System.out.println(objs[i] instanceof Father); // objs[i]를 Father라고 불러도 되는지?
			if(objs[i] instanceof Father) {
				((Father)objs[i]).printInfo();
				// objs[1]일 때 대입된 Son()의 데이터타입은 Son이니까 Father라고 불러도 됨.
			}else {
				System.out.println("새엄마는 소개가 없어요");
			}
		}
	}
}
