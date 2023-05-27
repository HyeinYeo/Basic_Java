/* final */
/**
 * <final 키워드의 사용법 3가지>
 * 1. final 클래스
 * 		final class Book{}
 * 		- 클래스를 상속받을 수 없음을 지정(= 자식 클래스 생성 불가)
 * 
 * 2. final 메소드
 * 		protected final int sum(){}
 * 		- 정적 바인딩화 시킴
 * 		- 오버라이딩할 수 없는 메소드
 * 			- 자식 클래스가 부모 클래스의 특정 메소드를 오버라이딩하지 못하게 하고, 무조건 상속받아 원형을 사용하게 함
 *
 * 3. final 필드(상수)
 * 		final int ROWS = 10; 
 * 		- 필드를 상수화 시킴
 * 		- 초기값 지정 필수
 * 
 * 		public static final double PI = 3.14;
 * 		- public static과 함께 사용하면 모든 클래스에서 공유할 수 있는 전역 상수가 됨!
 * 		  다른 클래스에서는 <클래스명>.PI 형태로 사용
 * */
public class Ch04_10_final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
