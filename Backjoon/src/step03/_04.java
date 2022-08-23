package step03;
/*
 * 날짜 : 2022/08/23
 * 이름 : 양재영
 * 내용 : 백준 3단계 4번 문제. 영수증
 */

import java.util.Scanner;

public class _04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int i=1; i<=b; i++) {
			
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		a = a - (x*y);
		}
		if(a==0) {
			System.out.println("Yes");
		}else
			System.out.println("No");

}
}