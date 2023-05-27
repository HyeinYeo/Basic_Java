/* Static 멤버 */
/**
 * <static 멤버(클래스 멤버)>
 * 	- 객체 생성 없이 사용 가능
 * 	  => static 멤버가 포함된 객체 생성 전에도 클래스명으로 사용 가능
 * 		 why? static 멤버가 속한 클래스가 로딩되는 시점에 static 멤버가 생성(메모리 할당)됨
 * 
 * 	- 클래스당 하나만 생성됨
 * 	  => 동일한 클래스의 모든 객체들이 공유
 * 
 * 	- main() 메소드 실행 전 생성
 * 	
 * 	- 객체와 클래스명, 두 가지로 접근 가능
 * 
 * 	- 전역 변수, 전역 함수 만들 때 활용
 * 	  public static int a = 5; // 전역변수
 * 	  public static double sum(double x, double y); // 전역함수
 * 
 * 	- static 메소드는 static 변수만 사용 가능
 * 	  - non-static 메소드는 static 멤버든 아니든 모두 사용 가능
 * 	  why? non-static 멤버는 객체가 생성될 때 함께 생성되는 인스턴스 멤버이므로, 객체 없이도 존재하는 static 메소드가 사용 불가능 
 * 
 * 	- static 메소드는 this 사용 불가능
 * 	  why? this는 객체가 생성되어야 사용 가능한 것이므로, 객체 없이도 존재하는 static 메소드는 사용 불가능
 * 
 * */
public class Ch04_09_Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
