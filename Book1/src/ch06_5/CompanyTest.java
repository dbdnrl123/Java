package ch06_5;

public class CompanyTest {
	public static void main(String[] args) {
		Company myCompany1 = Company.getInstatnce();
		Company myCompany2 = Company.getInstatnce();
		System.out.println(myCompany1 == myCompany2);
	}

}
