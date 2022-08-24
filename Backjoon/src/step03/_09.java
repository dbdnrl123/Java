package step03;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/24
 * 이름 : 양재영
 * 내용 : 백준 3단계 9번 문제. 별 찍기 - 2
 */

public class _09 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
			
				System.out.print(" ");
		}
		
			for(int k=1; k<=i; k++) {
		System.out.print("*");
			}
			System.out.println();
		}
	}
}

