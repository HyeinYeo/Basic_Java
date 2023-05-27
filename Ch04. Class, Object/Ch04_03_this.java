/* this VS. this() */
/**
 * <this>
 * 	- 현재 객체 자신에 대한 레퍼런스(현재 실행되고 있는 메소드가 속한 객체에 대한 레퍼런스)
 * 		- this.name, this.func()으로 사용
 * 		- 리턴값으로도 사용 가능(객체 자신의 레퍼런스 리턴)
 * 		** C++의 this는 포인터라 this->name 으로 접근. 자바는 포인터 없음!
 * 
 * 		- this 없이, 매개변수와 멤버변수 혼용할 경우, 모두 멤버변수로 판단해버림
 * 
 * <this()>
 * 	- 클래스 내에서 생성자가 다른 생성자를 호출할 때 사용하는 자바 코드
 * 	- 주의점
 * 		- this()는 반드시 생성자 코드에서만 호출 가능
 * 		- 반드시 같은 클래스 내 다른 생성자 호출 시 사용
 * 		- 반드시 생성자 첫 번째 문장이 되어야 함(첫 번째로 시작해야 함)
 * */
class Book{
		String title;
		String author;
		
		// public Book(){} // 현재 기본 생성자 정의 X
		
		public Book() {
			this("미정", "미정"); // 밑에 있는 생성자 호출함
			System.out.println("기본 생성자 호출됨");
		}
		
		public Book(String title, String author) {
			this.title = title; // this 없으면, 모두 멤버변수 title로 인식함
			this.author = author;
		}
		
		public Book getBook() {
			return this; // 객체 자신의 레퍼런스 리턴
		}
}

public class Ch04_03_this {
	public static void main(String[] args) {
		Book b1 = new Book("춘향전", "작자미상");
		Book another_b1 = b1.getBook(); // another_b1은 b1과 똑같은 힙 영역 객체 가리킴
		System.out.println(another_b1.title + " | " + another_b1.author); // 춘향전 | 작자미상
		
		Book b2 = new Book(); // 기본 생성자 호출됨
		System.out.println(b2.title + " | " + b2.author); // 미정 | 미정
	}
}
