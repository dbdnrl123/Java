package step04;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/26
 * 이름 : 양재영
 * 내용 : 백준 4단계 2번 문제. 최댓값
 */

public class _02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[]= {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(),
				sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(),
				sc.nextInt()};
		
		int count = 0;
		int max = 0;
		int index = 0;
		
		
		for(int value : arr) {
			count++;
			
			if(value > max) {
				max = value;
				index = count;
			}
			
		}
		System.out.println(max + "\n" +index);
	
	}

}
