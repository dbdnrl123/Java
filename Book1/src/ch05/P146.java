package ch05;
/*
 * 날짜 : 2022/09/13
 * 이름 : 양재영
 * 내용 : StudentTest 실행 클래스 만들기
 */

public class P146 {
	public static void main(String[] args) {
		P162 studentAhn = new P162();
		studentAhn.studentName = "안승연";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}

}
