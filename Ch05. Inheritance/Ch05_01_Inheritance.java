/* 상속 */
/**
 * - 상속
 * 	- 부모 클래스 = 슈퍼클래스
 * 	- 자식 클래스 = 서브클래스
 * 	class Student extends Person{}
 * 
 * - 객체-클래스 관계
 * 		- 자식 클래스 객체는 부모 클래스의 public 멤버, 자식 클래스의 public 멤버 접근 가능
 * 		- private 멤버는 접근 불가능
 * 
 * - 자식 클래스 - 부모 클래스 관계
 * 		- 자식 클래스 내에서, 부모의 private 멤버 접근 불가(나머지는 모두 가능)
 * 
 * - 특징
 * 	- 다중상속 X
 * 		: 함수호출의 모호성 원천 방지
 * 	- 상속 횟수 제한 X
 * 	- 모든 클래스는 Object 클래스를 자동으로 상속 받도록 컴파일됨.
 * 		: Object 클래스는 최상위의 슈퍼클래스
 * */
class Person{
	private String name;
	public void setName(String name) {
		this.name = name;
	}
}
class Student extends Person{
	private int id;
	public void setID(int id) {
		this.id = id;
		// 부모클래스의 name 멤버 변수는 접근 불가능(private이기 때문). public인 setName으로만 접근 가능
	}
}
public class Ch05_01_Inheritance {
	public static void main(String[] args) {
		Person p = new Person();
		p.setName("성춘향");
		//p.setID(1); // 부모 객체로 자식 클래스엔 아예 접근 불가능
		
		Student s = new Student();
		s.setName("이몽룡"); // 자식 객체로 부모의 public 멤버 접근 가능
		s.setID(232); // 자식 객체로 자식의 public 멤버 접근 가능
		// s.name = "박씨"; // private 멤버에는 접근 불가능
		// s.id = 3; // private 멤버에는 접근 불가능
	}

}
