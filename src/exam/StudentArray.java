package exam;

class Student {  // Student가 데이터타입이 되니까 배열로 만들수있음.
	String name;
	int grade;
	String schoolName;
}
public class StudentArray {
	public static void main(String[] args) {
		Student[] students = new Student[10]; // 이 상태에선 다 null값이 들어가 있음.
		// System.out.println(students[0].name); // 이 오류는 그냥 못잡고 실행해야 알 수 있음.
		// students[9] = new Student();
		// Student student = new Student();
		// student.grade = 3;
		for(int i=0;i<students.length;i++) {
			students[i] = new Student();
			students[i].grade = i+1;
		}   // 12~17라인 한번더 보기@
		System.out.println(students[9].grade);  // 여기 오류 안나게 하기. 15~16라인
		
	}
}


// int[] nums = new int[5];  => nums의 데이터타입은 int배열, nums[0]에 있는 데이터타입은 int
// Student[] students = new Student[10]; => students의 데이터타입은 Student 배열,
// students[0]에 있는 변수의 데이터타입은 Student