/* 인터페이스 */
/**
 * - 인터페이스 선언
 * 		interface <인터페이스명>{}
 * 
 * - 인터페이스 종류
 * 		1) 상수
 * 			public static final double PI = 3.14;
 * 			- public static final 생략 가능
 * 
 * 		2) 추상 메소드
 * 			public abstract void call();
 * 			- public abstract 생략 가능
 * 			- 다른 접근 지정자(protected, default, private) 지정 불가능
 * 			- 메소드 내용 없음(추상 메소드니까)
 * 
 * 		3) default 메소드
 * 			public default void call(){ System.out.println("띠리링"); }
 * 			- 접근 지정은 public으로 고정!
 * 			- 메소드 내용 있어야 함
 *
 * 		4) private 메소드
 * 			private void call(){System.out.println("띠리링");}
 * 			- 인터페이스 내에서만 호출 가능
 * 		
 * 		5) static 메소드
 * 			static void call(){System.out.println("띠리링");}
 * 			- 접근 지정 생략 시 public
 * 
 * 			private static void call(){System.out.println("띠리링");}
 * 			- private 접근 지정 가능
 * 
 * 	- 인터페이스 특징
 * 		- protected 접근 지정 선언 불가
 * 		- 필드(멤버 변수)는 만들 수 없음
 * 		- 객체 생성 불가능
 * 		- 인터페이스 타입 레퍼런스 변수 선언까지는 가능
 * 			PhoneInterface phone;
 * 		- 인터페이스끼리 상속 가능
 * 		- 인터페이스 상속 받아 클래스 작성 시, 모든 추상 메소드 구현 필수
 * 
 * 	- 인터페이스 구현(인터페이스 상속받아서 클래스 작성)
 * 		class <클래스명> implements <인터페이스명>{}
 * 
 * 		class <클래스명> implements <인터페이스명>, <인터페이스명>...{<메소드 구현>}
 * 		- 클래스 작성 시 인터페이스 다중상속 가능
 * 
 * 	- 인터페이스 상속
 * 		interface <인터페이스명> extends <인터페이스명>{ <추상메소드~~> }
 * 		
 * 		interface <인터페이스명> extends <인터페이스명>, <인터페이스명> ...{ <추상메소드~~> }
 * 		- 인터페이스끼리 상속 시 다중상속 가능
 * 
 * 	- 클래스 상속하면서 인터페이스 구현
 * 		class A extends B implements IX, IY{ }
 * 		- 클래스 A는 클래스 B를 상속 받고, 인터페이스 IX와 IY에 선언된 추상메소드 모두 구현
 * */

public class Ch05_08_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
