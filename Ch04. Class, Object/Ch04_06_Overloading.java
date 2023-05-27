/* 메소드 오버로딩 */
/**
 * 오버로딩 조건
 * 	- 메소드 이름 동일
 * 	- 메소드 매개변수의 타입이나 개수는 달라야
 * 
 * - 리턴 타입이나 접근 지정자는 메소드 오버로딩과 관계 X
 * - 오버로딩은 컴파일 타임에 자바 컴파일러에 의해 판단
 * */
public class Ch04_06_Overloading {
	static public int getSum(int x, int y) {
		return x+y;
	}
	static public double getSum(double x, double y) {
		return x+y;
	}
	public static void main(String[] args) {
		int a = 2, b = 6;
		System.out.println(getSum(a, b)); // 8: int getSum() 실행
		
		double i = 2.8, j = 3.3;
		System.out.println(getSum(i, j)); // 6.1: double getSum() 실행
	}

}
