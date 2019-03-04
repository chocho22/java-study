package oop.abst;

interface Viewer {
	public void show();
	public void off();
}

public class AnonymousTest {
	public static void main(String[] args) {
		Viewer v = new Viewer() {
			public void show() {
				System.out.println("show");
			}
			public void off() {
				System.out.println("off");
			}
		};
		v.show();
	}
}
