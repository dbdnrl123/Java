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
		
		int arr[]= new int[10];
		boolean bl;
		int cnt = 0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt() % 42;
			
			}
		for(int i=0; i<arr.length; i++) {
			bl = false;
			for(int k=i+1; k<arr.length; k++) {
				if(arr[i] == arr[k]) {
					bl = true;
					break;
				}
			}
			if(bl == false) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
