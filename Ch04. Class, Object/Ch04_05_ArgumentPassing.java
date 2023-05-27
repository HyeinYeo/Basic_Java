/* 메소드(함수) 인자 전달 */
/**
 * - 자바 메소드 인자 전달 방식
 * 		1. call by value
 * 			- 겉으로는 모두 call by value 방식
 * 			- 원시타입 자료형, String 자료형은 모두 call by value 방식으로 작동
 * 				- 매개변수에 인자가 복사됨. 따라서 원래 변수의 값은 변하지 않음
 * 				- String은 객체형(참조형)이지만 인자로 쓰이면 call by value로 작동
 * 		
 * 		2. call by reference
 * 			- 자바엔 call by ref는 없지만, 레퍼런스 타입에 한해 call by ref처럼 동작
 * 			- 배열에 대한 레퍼런스, 객체에 대한 레퍼런스가 인자로 전달되는 경우, 매개변수에 객체가 복사되는 것이 아니라 레퍼런스만 전달됨.
 * 			- 매개변수 전달로 인한 오버헤드가 없다는 장점
 * 			- 메소드에서 전달 받은 객체의 필드나 배열의 원소값이 (원치 않게) 변경될 수 있으므로 주의
 * */
class Donut{
		int radius;
		public Donut(int radius) {
			this.radius = radius;
		}
		// 3. 객체 전달
		public void increaseDonut(Donut d) {
			d.radius++;
		}
	}
public class Ch04_05_ArgumentPassing {
	// 1. 원시 자료형의 call by value
	public static void increaseNum(int x) {
		x++;
	}
	
	// 2. 배열 전달
	public static void increaseArray0(int arr[]) {
		arr[0]++;
	}
	
	public static void main(String[] args) {
		// 1. 원시 자료형의 call by value
		int a = 5;
		increaseNum(a);
		System.out.println(a); // 5 => 변함 없음
		
		// 2. 배열 전달
		int array[] = {4, 7, 3, 6};
		increaseArray0(array);
		System.out.println(array[0]); // 5 => 4에서 5로 변함
		
		// 3. 객체 전달
		Donut d = new Donut(6);
		d.increaseDonut(d);
		System.out.println(d.radius); // 7 => 6에서 7로 변함
	}

}
