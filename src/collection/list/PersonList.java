package collection.list;

import java.util.ArrayList;
import java.util.List;

class Person {
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}

public class PersonList {

	public static void main(String[] args) {
		Person p = new Person();
		p.setName("홍길동");
		System.out.println(p.getName());

		
		List<Person> pList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			Person p1 = new Person();
			p1.setName("이름" + (i + 1));
			pList.add(p1);
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(pList.get(i).getName());
		}
	}
}
