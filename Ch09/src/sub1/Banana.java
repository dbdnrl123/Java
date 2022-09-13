package sub1;

public class Banana{

	private String country;
	private int price;

	public Banana(String country, int pirce) {
		this.country = country;
		this.price = price;
	}
	
	@Override
	public String toString() {
		// 객체 정보 조회
		System.out.println("객체번호 : "+ hashCode());
		System.out.println("원산지 : "+ country);
		System.out.println("가격 : "+ price);
		
		return super.toString();
	}
}
