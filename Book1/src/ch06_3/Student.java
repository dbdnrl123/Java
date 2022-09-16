package ch06_3;
/*
 * 날짜 : 2022/09/15
 * 이름 : 양재영
 * 내용 : static 변수 사용하기
 */

public class Student {
	public static int serialNum = 1000;
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public Student() {
		serialNum++;
		studentID = serialNum;
	}
	
	public String getStringName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
}
