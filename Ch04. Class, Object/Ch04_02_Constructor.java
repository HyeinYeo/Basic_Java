/* 생성자 */
/**
 * - 사용 목적
 * 	 : 객체 생성 시 객체의 초기화를 위해 자동으로 실행되는 메소드
 * 
 * - 특징
 * 		- 생성자의 이름은 클래스명과 동일
 * 		- 생성자는 여러 개 작성 가능(오버로딩 가능)
 * 		- 생성자는 new를 통해 객체를 생성할 때 한 번만 자동으로 호출(호출하고 싶을 때 아무 때나 호출 불가능)
 * 		- 생성자 리턴 타입 X
 * 			public int Circle(){} => 불가능!
 * 			- 그러나 생성자 함수 내에서 return 사용 불가능한 것은 아님
 * 
 * 	- 기본 생성자
 * 		- 객체 생성 시 반드시 생성자 실행
 * 		- 클래스에 명시적으로 생성자 함수 없는 경우에도 컴파일러가 기본 생성자 자동 생성 및 삽입
 * 		- but, 다른 생성자가 정의되어 있는 경우엔 기본 생성자 삽입 X
 * 			- why? 자바 컴파일러가 클래스의 의도를 훼손하지 않기 위해서
 * 			=> 이때 기본 생성자 정의 안 하고, 기본 생성자 함수 호출하는 객체 생성하면 오류 발생
 * */

class Book{
		String title;
		String author;
		
		// public Book(){} // 현재 기본 생성자 정의 X
		
		public Book(String t) { // 생성자 1 -> 반환값이 없다!
			title = t;
		}
		public Book(String t, String a) { // 생성자 2 (오버로딩 가능!)
			title = t;
			author = a;
		}
	}
public class Ch04_02_Constructor {
	public static void main(String[] args) {
		Book b1 = new Book("신발신발 아가씨"); // 생성자 1 실행됨
		Book b2 = new Book("책 먹는 여우", "프란치스카 비어만"); // 생성자 2 실행됨
		// Book b3 = new Book(); // 현재 기본생성자 정의되어 있지 않으므로 오류 발생!
		
		System.out.println(b1.title + " | " + b1.author); // 신발신발 아가씨 | null
		System.out.println(b2.title + " | " + b2.author); // 책 먹는 여우 | 프란치스카 비어만
	}

}
