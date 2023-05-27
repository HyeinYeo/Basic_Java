/* 클래스와 객체 */
/**
 * - 클래스
 * 		- 클래스 외부에 필드, 메소드 둘 수 없음
 * 		- public을 쓸 수 있는 클래스는 파일명과 일치하는 클래스 뿐!
 * 			- public 내부의 public 클래스는 괜찮다
 * 
 * - 객체 생성
 * 		- Circle pizza = new Circle();
 * 		=> C++은 Circle pizza;만 해도 객체 생성되었지만,
 * 		   자바는 Circle pizza;만 하면 객체에 대한 레퍼런스 변수만 스택 영역에 선언됨
 * 		   pizza = new Circle();해야지만 힙 영역(Circle 타입 크기의 메모리 할당)에 드디어 객체가 생성됨(생성자 코드 실행)
 * 		   생성완료 후, 객체의 주소를 레퍼런스 변수에 대입함
 */
class Circle {
		public int radius; // 멤버 변수
		public String name;
		
		public Circle() {} // 생성자 메소드
		public double getArea() { // 멤버 메소드
			return 3.14*radius*radius;
		}
}

public class Ch04_01_Class {
	
	public static void main(String[] args) {
		Circle pizza; // 레퍼런스 변수 선언
		pizza = new Circle(); // 객체 생성!!
		
		pizza.radius = 10; // '객체.멤버'로 접근
		pizza.name = "Hot Pizza";
		double area = pizza.getArea();
		System.out.println(area);
	}
}
