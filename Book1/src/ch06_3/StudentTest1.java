package ch06_3;
/*
 * 날짜 : 2022/09/15
 * 이름 : 양재영
 * 내용 : static 변수 테스트하기
 */
public class StudentTest1 {
	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.serialNum);
		studentLee.serialNum++;
		
		Student studentSon = new Student();
		studentSon.setStudentName("손수경");
		System.out.println(studentSon.serialNum);
		System.out.println(studentLee.serialNum);
	}

}
