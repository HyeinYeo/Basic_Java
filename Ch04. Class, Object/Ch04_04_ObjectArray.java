/* 객체 배열 */
/**
 * - 객체 배열
 * 	 : 객체에 대한 레퍼런스를 원소로 갖는 배열
 * 	 - 배열에 대한 레퍼런스만 스택 영역에 있고 배열과, 객체는 모두 힙 영역에 생성
 * 	 
 * 	 Circle c[] = new C[n];			// => 레퍼런스 배열 생성
 * 	 for (int i = 0; i < c.length; i++) // => 배열 원소(=객체 레퍼런스) 각각에 대해, 객체 생성
 * 		c[i] = new Circle();
 * 
 * 	 [배열에 대한 레퍼런스] -> [객체 1 레퍼런스][객체 2 레퍼런스][객체 3 레퍼런스] -> 객체 1 | 객체 2 | 객체 3
 * 
 * 
 * */
class Pizza{
	int radius;
	public Pizza(int radius) {
		this.radius = radius;
	}
	public void show() {
		System.out.println("면적: " + 3.14*radius*radius);
	}
}
public class Ch04_04_ObjectArray {
	public static void main(String[] args) {
		Pizza p[]; // 객체 배열 레퍼런스 선언
		p = new Pizza[3]; // 래퍼런스 배열 생성
		for (int i = 0; i < p.length; i++) // 객체 생성
			p[i] = new Pizza(i+1);
		
		for (int i = 0; i < p.length; i++)
			p[i].show();
		
		/* 출력 결과
		 면적: 3.14
		 면적: 12.56
		 면적: 28.259999999999998
		 * */

	}

}
