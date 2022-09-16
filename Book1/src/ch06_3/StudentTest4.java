package ch06_3;

public class StudentTest4 {
	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.setStudentName("이지원");
		System.out.println(Student2.getSerialNum());
		System.out.println(studentLee.studentName + "학번:" + studentLee.studentID);
		
		Student studentSon = new Student();
		studentSon.setStudentName("손수경");
		System.out.println(Student2.getSerialNum());
		System.out.println(studentSon.studentName + "학번:" + studentSon.studentID);

	}
}
