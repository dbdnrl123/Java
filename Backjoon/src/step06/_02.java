package step05;
/*
 * 날짜 : 2022/09/02
 * 이름 : 양재영
 * 내용 : 백준 5단계 2번 문제. 숫자의 합
 */

import java.util.Scanner;

public class _02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String a = sc.next();
		
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			sum += a.charAt(i)-'0';

		}

		System.out.print(sum);
	}

}
