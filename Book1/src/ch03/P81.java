package ch03;
/*
 * 날짜 : 2022/08/18
 * 이름 : 양재영
 * 내용 : 조건 연산자를 사용하여 부모님의 나이 비교하기
 */

public class P81 {
	public static void main(String[] args) {
		int fatherage = 45;
		int motherage = 47;
		
		char ch;
		ch = (fatherage > motherage) ? 'T' : 'F';
		
		System.out.println(ch);
	}

}
