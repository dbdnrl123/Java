package step03;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/22
 * 이름 : 양재영
 * 내용 : 백준 3단계 2번 문제. 구구단
 */

public class _02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
		
			System.out.println((a+b));
		}
		
	}

}
