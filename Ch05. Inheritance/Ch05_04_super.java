/* 서브클래스에서 슈퍼클래스 생성자 선택*/
/**
 * - 서브클래스에 명시적 지정이 없는 경우
 * 		- 슈퍼클래스의 기본 생성자 선택(자바 컴파일러가 강제 선택)
 * 		- 만약 슈퍼클래스에 기본 생성자 외의 생성자가 정의된 경우, 기본생성자가 정의되어 있지 않으면 오류 발생
 * 
 * - 명시적 지정 super() => 명시적 선택이 원칙!
 * 		- super() : 슈퍼 클래스의 생성자를 호출하는 코드
 * 		- 반드시 생성자의 첫 라인에 사용되어야 함 (순서면에서 this()와 유사)
 * */
class Q{
	public Q() { System.out.println("Q 기본생성자"); }
	public Q(int x) {System.out.println("Q 매개변수 생성자 " + x);} // 1번째 실행
}
class R extends Q{
	public R() {System.out.println("R 기본생성자");}
	public R(int x) {
		super(x); // Q 클래스(슈퍼클래스)의 매개변수 생성자를 지정 호출!
		System.out.println("R 매개변수 생성자 " + x); // 2번째 실행
	} 
}
public class Ch05_04_super {
	public static void main(String[] args) {
		R r = new R(55);
		
		/*<실행 결과>
		 	Q 매개변수 생성자 55
			R 매개변수 생성자 55
		 */
	}

}
