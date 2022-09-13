package ch05;
/*
 * 날짜 : 2022/08/25
 * 이름 : 양재영
 * 내용 : Student 클래스에 main()함수 추가하기
 */

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public String getStudentName() {
		return studentName;
	}
	
	public static void main(String[]args) {
		P162 studentAhn = new P162();
		studentAhn.studentName = "안연수";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}

}
