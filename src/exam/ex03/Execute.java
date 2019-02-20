package exam.ex03;

public class Execute {

	public static void main(String[] args) {
		Dog[] dogs = new Dog[10];
		for (int i = 0; i < dogs.length; i++) {
			dogs[i] = new Dog();
			dogs[i].setName("멈미" + (i + 1));
			dogs[i].setAge(i);
		}
		for (int i = 0; i < dogs.length; i++) {
			System.out.println(i + "번째 강아지의 이름은 " + dogs[i].getName());
			System.out.println(i + "번째 강아지의 나이는 " + dogs[i].getAge());
		}
	}
}
