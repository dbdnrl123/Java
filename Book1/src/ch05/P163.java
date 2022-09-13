package ch05;
/*
 * 날짜 : 2022/09/13
 * 이름 : 양재영
 * 내용 : private 변수 테스트하기
 */

public class P163 {
	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.studentName = "이상원";
		
		System.out.println(studentLee.getStudentName());
	}

}
