package collection.list;

import java.util.ArrayList;
import java.util.List;

class Dog {
	private String name;
	private Integer age;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Integer getAge() {
		return this.age;
	}
}

public class DogList {
	public static void main(String[] args) {
		List<Dog> dogList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			Dog d = new Dog();
			d.setName("강아지" + (i + 1));
			d.setAge(i + 1);
			dogList.add(d);
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("강아지 이름 : " + dogList.get(i).getName());
			System.out.println("강아지 나이 : " + dogList.get(i).getAge());
			System.out.println();
		}
		
//		for(Dog d : dogList) {
//			System.out.println(d.getName());
//			System.out.println(d.getAge());
//		}
	}
}
