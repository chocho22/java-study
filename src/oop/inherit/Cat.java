package oop.inherit;

public class Cat extends Animal {
	Cat(int age, String type) {   // 파라메터가 없으면 '기본생성자' Cat(){} 이 숨어있었을것.
		// 여기에는 파라메터가 있으니까 기본생성자가 필요하면 따로 Cat(){} 를 만들어줘야 함.
		this.age = age;
		this.type = type;
	}
	// 여기서 파란색 age, type은 원래 Animal거인데
	// Cat이 상속받았기 때문에 Cat거가 됨....

	public static void main(String[] args) {  // main 메서드는 어느 클래스에 있어도 됨.!!
		Cat cat = new Cat(6, "샴");
		cat.eat();
		cat.sleep();
		cat.run();
		Animal dog = new Dog(6, "푸들");
		// dog가 Animal을 상속받고 있기 때문에 Dog를 Animal이라고 부를 수 있다.
		// 하지만 Animal을 Dog라고 부를 수는 없다.
		// 따라서 Dog dog = new Animal(); 은 성립 할 수 없음.
		// 벤 다이어그램으로 이해하면 안됨.!!!
		dog.eat();
		dog.sleep();
		dog.run();
	}

}
