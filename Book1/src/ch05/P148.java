package ch05;
/*
 * 날짜 : 2022/09/13
 * 이름 : 양재영
 * 내용 : 인스턴스 여러 개 생성하기
 */

public class P148 {
	public static void main(String[] args) {
		P162 student1 = new P162();
		student1.studentName = "안연수";
		System.out.println(student1.getStudentName());
		P162 student2 = new P162();
		student2.studentName = "안승연";
		System.out.println(student2.getStudentName());
	}

}
