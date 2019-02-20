package exam.ex03;

public class Dog {
	private String name;
	private int age;
	
	public void back() {
		System.out.println(name + "가 짖습니다!");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}
	
//	public static void main(String[] args) {
//		Dog d = new Dog();
//		d.name = "카드";
//		d.back();
//		d.setAge(10);
//		System.out.println(d.age);
//		Dog d2 = new Dog();
//		d2.setAge(20);
//		System.out.println(d2.age);
//	}
}



