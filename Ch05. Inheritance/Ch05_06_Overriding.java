/* 메소드 오버라이딩 */
/**
 * - 자바는 기본적으로 모든 것이 다 동적 바인딩(virtual - 오버라이딩 된 메소드부터 실행)
 * 		- 메소드에 final 붙일 때 정적 바인딩 됨(부모 클래스의 메소드 실행하도록)
 * 		- super 키워드 이용 시 정적 바인딩 됨
 * 		- private 접근지정자 설정한 메소드 정적 바인딩 됨
 * 		- static으로 선언한 메소드 정적 바인딩 됨
 * 		- 업 캐스팅된 객체에서, 레퍼런스로 오버라이딩된 메소드 실행 시, 오버라이딩된 메소드만 실행됨(부모 클래스의 메소드 실행 X) => 동적 바인딩
 * 		- 오버라이딩 메소드라는 것을 표시하기 위해 메소드 위에 @Override 데코레이터 붙이기 가능
 * 
 * 		** 업캐스팅 아니더라도 동적바인딩!(네 가지 경우만 정적바인딩임)
 * 
 * - 필드(멤버변수) 오버라이딩은 없음! => 단지 은닉될 뿐
 * 
 * - 제약 조건
 * 		- 슈퍼 클래스의 메소드와 동일한 원형으로 작성
 * 		- 슈퍼 클래스 메소드의 접근 지정자보다 접근 범위 좁혀서 오버라이딩 불가능
 * 			접근 지정자 범위(넓은 순): public -> protected -> 디폴트 -> private
 * 			슈퍼클래스: protected void draw(){}
 * 			서브클래스: public 또는 protected로만 오버라이딩 가능
 * 		- static, private, final로 선언된 메소드는 오버라이딩 불가능
 * 
 * - super
 * 		- 슈퍼 클래스에 대한 레퍼런스
 * 		- '현재 객체 내'의 슈퍼 클래스 멤버 접근 가능
 * 		- 정적 바인딩을 통해 슈퍼 클래스 멤버 접근 가능
 * 
 * 
 * */
class Shape{
	protected String name;
	public void paint() {
		draw(); // 오버라이딩된 메소드 있을 경우, 무조건 오버라이딩된 draw() 실행
	}
	public void draw() {
		System.out.println(name);
	}
}
class Circle extends Shape{
	protected String name; // 슈퍼클래스(Shape)의 name은 은닉됨
	@Override
	public void draw() { // 슈퍼클래스에서 접근지정자가 public이므로, public으로만 오버라이딩 가능
		name = "Circle"; // this.name과 같음
		super.name = "Shape"; // super 레퍼런스로 슈퍼 클래스 멤버 접근
		super.draw(); // super 레퍼런스로 슈퍼 클래스 멤버 접근(정적 바인딩)
		
		System.out.println(name);
	}
}
public class Ch05_06_Overriding {

	public static void main(String[] args) {
		// 업 캐스팅 아니어도 동적 바인딩
		Shape s1 = new Shape();
		s1.paint(); // Shape 클래스에 있는 draw()가 실행되긴 하지만, 동적 바인딩임
		
		// 업 캐스팅 동적 바인딩
		Shape s2 = new Circle(); // 레퍼런스 s2가 가리키는 객체의 클래스형이 Circle
		s2.paint(); // Circle 클래스에 오버라이딩된 draw()가 실행됨(동적 바인딩)
					// draw() 실행 시, super로 Shape의 draw()도 실행해줌

	}

}
