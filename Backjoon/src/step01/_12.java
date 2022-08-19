package step01;
/*
 * 날짜 : 2022/08/19
 * 이름 : 양재영
 * 내용 : 백준 1단계 12번 문제. 곱셈
 */

import java.util.Scanner;

public class _12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int q = b%10;
		int w = b/10%10;
		int e = b/100%10;
		
		System.out.println(a*q);
		System.out.println(a*w);
		System.out.println(a*e);
		System.out.println(a*b);
		
	}

}
