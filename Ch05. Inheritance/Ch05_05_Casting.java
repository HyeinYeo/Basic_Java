/* 업캐스팅 & instanceof 연산자*/
/**
 * " 레퍼런스가 가리키는 객체가 어떤 클래스형인가?"
 * 
 * 1. 업 캐스팅 => 오버라이딩과 연결
 * 		- 부모 클래스의 레퍼런스로 자식 클래스 객체 가리키게 하는 것
 * 			= 서브 클래스 객체에 대한 레퍼런스틑 슈퍼 클래스 타입으로 변환하는 것
 * 		- 업 캐스팅 레퍼런스(부모 클래스 레퍼런스)는 부모 클래스 멤버만 접근 가능
 * 		- 객체를 업 캐스팅하면, 그 객체도 부모 타입의 객체로 취급됨
 * 			Person(new Student())
 * 		- 명시적 타입 변환 불필요
 * 			p = (Person)s; // Person 캐스팅 생략 가능
 * 
 * 2. 다운 캐스팅
 * 		- 업 캐스팅 상태에서, 부모 타입의 레퍼런스를 자식 타입의 레퍼런스로 변환
 * 			- 부모 객체를 자식 클래스형 객체로 캐스팅
 * 		- 명시적 타입 변환 필요
 * 		- 자식 클래스형 객체 전체 접근 가능
 * 
 * 3. instanceof 연산자
 * 		- 업 캐스팅된 객체의 타입이 어떤 클래스형의 객체인지 구별해야 할 필요 있음
 * 		- <레퍼런스> instanceof <클래스명>
 * 		  레퍼런스가 가리키는 객체가 어떤 클래스형인지 구분
 * 		  <클래스명>에 해당하는 클래스가 맞으면, true 리턴함
 * 		- 클래스에만 instanceof 사용가능(자료형, 변수 등 불가)
 * 		  - 단, String은 객체이기 때문에 가능하다!
 * 		
 * 		- 
 * */
class Vehicle{
	String name;
}
class Car extends Vehicle{
	int wheel;
}
class Bicycle extends Vehicle{
	int wheel;
}
public class Ch05_05_Casting {
	public static void print(Vehicle v) {// 레퍼런스 v가 가리키는 객체가 어떤 클래스형인지 구분해야 함
		if (v instanceof Vehicle) {
			System.out.println("탈것 클래스입니당 "); // 객체가 Car이든 Bicycle이든 Vehicle이든 모두 Vehicle 클래스를 포함하므로 무조건 true 반환
		}
		if (v instanceof Car) { // 레퍼런스 v가 가리키는 객체의 클래스가 Car이면 -> true 반환
			System.out.println("Car 클래스입니당 ");
		}
		else if (v instanceof Bicycle) { // 레퍼런스 v가 가리키는 객체의 클래스가 Bicycle이면 -> true 반환
			System.out.println("Bicycle 클래스입니당 ");
		}
	}
	public static void main(String[] args) {
		// 1. 업 캐스팅
		Car c = new Car();
		Vehicle v = c;
		v.name = "K7";  // 부모 클래스 멤버만 접근 가능
		// v.wheel = 4; // 자식 클래스 멤버 접근 불가능
		
		// 2. 다운 캐스팅
		Vehicle v2 = new Car();
		Car c2 = (Car)v2; // 부모(Vehicle) 타입의 레퍼런스를 자식(Car) 타입의 레퍼런스로 변환
		c2.wheel = 4; // 자식 클래스 멤버에 전부 접근 가능
		c2.name = "SM5"; // 부모 클래스 멤버 접근도 당연히 가능
		
		// 3. intstanceof 연산자
		Vehicle benz = new Car();
		Vehicle alton = new Bicycle();
		
		// 레퍼런스 benz, alton이 가리키는 객체가 어떤 클래스형인지 구분해야 함
		print(benz);
		print(alton);
		/*<출력 결과>
		 *	탈것 클래스입니당 
			Car 클래스입니당 
			탈것 클래스입니당 
			Bicycle 클래스입니당 
		 * */
	}
}
