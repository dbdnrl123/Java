package ch05;
/*
 * 날짜 : 2022/09/13
 * 이름 : 양재영
 * 내용 : 참조 값 출력하기
 */

public class P150 {
	public static void main(String[] args) {
		P162 student1 = new P162();
		student1.studentName = "안연수";
		
		P162 student2 = new P162();
		student2.studentName = "안승연";
		
		System.out.println(student1);
		System.out.println(student2);
		
	}

}
