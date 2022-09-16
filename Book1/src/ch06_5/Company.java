package ch06_5;
/*
 * 날짜 : 2022/09/16
 * 이름 : 양재영
 * 내용 : static 응용 - 싱글톤 패턴
 */

public class Company {
	private static Company instance = new Company();
	private Company() {}

	public static Company getInstatnce() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
