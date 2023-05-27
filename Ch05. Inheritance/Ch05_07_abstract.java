/* 추상 클래스 */
/**
 * 1. 추상 클래스 - abstract class
 * 		- 추상 메소드를 포함하는 클래스
 * 		- 추상 메소드는 없지만 abstract로 선언한 클래스
 * 
 * 2. 추상 메소드
 * 		- 코드가 작성되어 있지 않고, abstract로 선언된 메소드
 * 
 * - 추상 클래스 특징
 * 		- 상속에서 슈퍼 클래스로 사용
 * 		- 객체 생성 불가능 but, 레퍼런스 변수 선언까지는 가능
 * 		- **추상 메소드 하나라도 가지고 있으면 추상 클래스로 선언해야 함
 * 		- 추상 클래스에도 생성자 있음!! => 여러 개 정의 가능
 * 			- 추상 클래스 상속 받은 서브클래스의 객체 만들 때, 추상 클래스 생성자가 실행됨
 * 
 * - 추상 클래스 사용
 * 		- 상속받은 클래스는 오버라이딩 해서 사용해야 함
 * 		- 설계와 구현 분리
 * 			- 인터페이스 역할
 */
abstract class Calculator{
	public abstract int add(int a, int b);
	public abstract int subtract(int a, int b);
}
class BasicCalc extends Calculator{
	@Override
	public int add(int a, int b) {
		return a+b;
	}
	@Override
	public int subtract(int a, int b) {
		return a-b;
	}
}
public class Ch05_07_abstract {

	public static void main(String[] args) {
		// Calculator c = new Calculator();  객체 생성 불가능!
		BasicCalc c = new BasicCalc();
		System.out.println(c.add(3, 4)); // 7
		System.out.println(c.subtract(10, 1)); // 9
	}

}
