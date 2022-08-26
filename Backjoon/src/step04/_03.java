package step04;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/26
 * 이름 : 양재영
 * 내용 : 백준 4단계 3번 문제. 나머지
 */

public class _03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[]= {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(),
				sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(),
				sc.nextInt(), sc.nextInt()};
		
		int n = 0;
		
		for(int i=0; i<n; i++) {
			int a=sc.nextInt();
			
			if(a%42!=0) {
				System.out.println(arr[i]);
			}
				
		}
	}

}
