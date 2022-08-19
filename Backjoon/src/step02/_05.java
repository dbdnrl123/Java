package step02;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/19
 * 이름 : 양재영
 * 내용 : 백준 2단계 5번 문제. 알람 시계
 */

public class _05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(b<45) {
			a--;
			b=60-(45-b);
			if(a<0) {
				a=23;
			}
			System.out.println(a + " " + b);
		}
		else
			System.out.println(a + " " + (b-45));
	}

}
