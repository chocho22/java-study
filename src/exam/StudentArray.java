package exam;

class Student {  // Student가 데이터타입이 되니까 배열로 만들수있음.
	String name;
	int grade;
	String schoolName;
}	// 이 상태에선 다 null값 들어가 있음
public class StudentArray {
	public static void main(String[] args) {
		Student[] students = new Student[10];
		//System.out.println(students[0].name); // 이 오류는 그냥 못잡고 실행해야 알 수 있음.
		// 다른 클래스 일이라서 null값이라는걸 모르는거 아닐가.... 생성자 호출을 안했으니까?
		//students[9] = new Student();
//		Student student = new Student();
//		student.grade = 3;
//		System.out.println(student.grade);  
		//System.out.println(students[9].name);
		for(int i=0;i<students.length;i++) {
			students[i] = new Student();
			students[i].grade = i+1;
		}   // 12~17라인 한번더 보기@
		System.out.println(students[9].grade);  // 여기 오류 안나게 하기. for 반복문이 정답.
	}
}

// int[] nums = new int[5];  => nums의 데이터타입은 int배열, nums[0]에 있는 데이터타입은 int
// Student[] students = new Student[10]; => students의 데이터타입은 Student배열,
// students[0]에 있는 변수의 데이터타입은 Student ***