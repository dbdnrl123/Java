package sub1;
/*
 * 날짜 : 2022/09/20
 * 이름 : 양재영
 * 내용 : 람다식 실습하기
 * 
 * 람다식(Lamda)
 *  - 함수형 프로그래밍을 지원하기 위한 구문형식
 *  - 자바에서는 @functionalinterface 인터페이스를 이용햇 ㅓ람다식 정의
 */

public class LamdaTest {
	public static void main(String[] args) {
		
		//람다식 정의
		Type1 t1 = () -> {System.out.println("Type1 람다식 실행,,,");};
		Type2 t2 = (x) -> System.out.println("Type2 람다식 : "+ x);
		Type3 t3 = (x, y) -> x + y;
		
		t1.f();
		t2.f(3);
		int result = t3.f(2, 3);
		
		System.out.println("result : " + result);
	}

}
