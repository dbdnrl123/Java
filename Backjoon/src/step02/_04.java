package step02;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/19
 * 이름 : 양재영
 * 내용 : 백준 2단계 4번 문제. 사분면 고르기
 */

public class _04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a>1) {
			if(b>1) {
				System.out.println("1");
				
			}
			else {
				System.out.println("4");
			}
		}
			
		if(a<1) {
			if(b>1) {
				System.out.println("2");
			}
			else {
				System.out.println("3");
			}
		}
	}

}
