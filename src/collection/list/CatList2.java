package collection.list;

import java.util.ArrayList;
import java.util.List;

class Cat {
	private String name;
	private int age;
	
	public Cat() {
		super();
	}
	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + "]";
	}
}
public class CatList2 {
	
	public static void main(String[] args) {
		List<Cat> catList = new ArrayList<>();
		for(int i=0;i<5;i++) {
			Cat c = new Cat();
			c.setName("고양이"+(i+1));
			c.setAge(i+1);
			catList.add(c);
		}
		
		for(int i=0;i<5;i++) {
			Cat c1 = catList.get(i);
			System.out.print(c1.getName());
			System.out.println(c1.getAge());
		}
	}
}
