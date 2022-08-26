package step04;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 날짜 : 2022/08/26
 * 이름 : 양재영
 * 내용 : 백준 4단계 1번 문제. 최소, 최대
 */

public class _01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int arr[]= new int[a];
		
		for(int i=0; i<a; i++) {
			arr[i] = sc.nextInt();
			
		}
		
		Arrays.sort(arr);
		System.out.println(arr[0] + " " + arr[a-1]);
		
	}

}
