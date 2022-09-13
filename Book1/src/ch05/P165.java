package ch05;
/*
 * 날짜 : 2022/09/13
 * 이름 : 양재영
 * 내용 : private 변수에 접근하기
 */

public class P165 {
	public static void main(String[] args) {
		Student studentLee = new Student();
		
		studentLee.setStudentName("이상원");
		
		System.out.println(studentLee.getStudentName());
	}

}
