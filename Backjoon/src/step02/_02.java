package step02;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/19
 * 이름 : 양재영
 * 내용 : 백준 2단계 2번 문제. 시험 성적
 */

public class _02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if(90<=a) {
			System.out.println("A");
		}
		else if(80<=a) {
			System.out.println("B");
		}
		else if(70<=a) {
			System.out.println("C");
	}
		else if(60<=a) {
			System.out.println("D");

}
		else
			System.out.println("F");
	}
}
