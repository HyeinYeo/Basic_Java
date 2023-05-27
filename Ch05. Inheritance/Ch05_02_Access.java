/* 상속과 protected 접근 지정 */
/**
 * 부모 클래스 멤버의 접근 지정자
 * - private : 어떤 다른 클래스에서도 접근 불가능. 부모 클래스 멤버들만 접근 가능
 * - 디폴트 : 같은 패키지 내의 클래스만 접근 가능(상속 상관 X)
 * - protected : 같은 패키지 클래스 + 상속 받는 자식 클래스(패키지 무관)
 * - public : 어디서든 접근 가능
 * */

public class A{
	private int a;
	int b;
	protected int c;
	public int c;
}

// 만약 B가 다른 패키지에 있다면?
public class B extends A{
	// a = 1; // 패키지 무관 접근 불가능
	// b = 2; // 상속 무관 패키지 다르므로 접근 불가능
	c = 3; // 다른 패키지이지만 상속받은 자식 클래스이므로 접근 가능
	d = 4; // 패키지 무관 접근 가능
}

/*
public class Ch05_02_Access {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
*/