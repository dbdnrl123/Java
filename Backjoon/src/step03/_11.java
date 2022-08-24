package step03;
/*
 * 날짜 : 2022/08/24
 * 이름 : 양재영
 * 내용 : 백준 3단계 11번 문제. A+B - 5
 */

import java.util.Scanner;

public class _11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a==0&&b==0) {
				break;
			}
			System.out.println(a+b);
			
		}

}
}