package step03;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/23
 * 이름 : 양재영
 * 내용 : 백준 3단계 6번 문제. A+B-7
 */

public class _06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("Case #"+i+":"+ " "+(a+b));
		}
		
	}

}
