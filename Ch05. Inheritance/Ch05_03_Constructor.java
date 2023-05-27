/* 상속과 생성자 */
/**
 * - 서브 클래스 생성자가 먼저 호출되지만, 슈퍼 클래스 생성자가 먼저 실행 -> 서브 클래스 생성자 실행
 * 	- 컴파일러는 서브클래스 생성자에 대해, 슈퍼클래스 생성자 호출한 뒤에 자신의 코드 실행하도록 컴파일
 * 
 * - 슈퍼 클래스 생성자 선택
 * 	- 서브 클래스의 각 생성자에 대해, 함께 실행될 슈퍼 클래스 생성자 지정하여야 함
 * 		- 슈퍼 클래스 생성자 명시적 지정 X -> 슈퍼 클래스 기본 생성자 호출하도록 컴파일
 * 		- super() 이용하여 명시적으로 지정 	
 * 
 * */
class X{
	public X() {System.out.println("생성자 X 실행");} // 1번째 실행
}
class Y extends X{
	public Y() {System.out.println("생성자 Y 실행");} // 2번째 실행, X 클래스의 기본 생성자 호출
}
class Z extends Y{
	public Z() {System.out.println("생성자 Z 실행");} // 3번째 실행, Y 클래스의 기본 생성자 호출
}
public class Ch05_03_Constructor {

	public static void main(String[] args) {
		Z z = new Z();
		/*<실행 결과>
		 	생성자 X 실행
			생성자 Y 실행
			생성자 Z 실행
		 * */
	}

}
