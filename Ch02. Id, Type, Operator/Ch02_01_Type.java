/* 변수 타입 */
/**
 	- 타입
 		1. 기본(원시) 타입
 			- boolean: true, false - 1비트
 				- 정수형과 연산 불가!!!
 			- char: 2바이트
 			- byte: 1바이트
 				- byte 강제 형 변환 시 나머지 값이 저장됨
 			- short: 2바이트
 			- int: 4바이트
 			- long: 8바이트
 			- float: 4바이트
 				- 숫자 뒤에 f 붙이면 리터럴 float 타입으로 강제 변환
 			- double: 8바이트, 실수 기본형
		2. 레퍼런스 타입
			- 배열에 대한 레퍼런스
			- 클래스에 대한 레퍼런스
			- 인터페이스에 대한 레퍼런스
		3. 문자열
			- String 클래스
			- 숫자 + 문자열 연산 시 => 숫자는 문자열로 자동 형변환되고 연결됨
			
		4. 상수 final
			final <자료형> <변수명> = <리터럴>;
			무조건 초기화가 되어야 함!
 */
public class Ch02_01_Type {
	public static void main(String[] args) {
		// byte 강제 형 변환
		int n = 300;
		byte b = (byte)n; // 300 % 256 = 44 저장됨
		
		// int끼리의 계산
		System.out.println(10/4); // 10, 4 둘 다 정수형 리터럴이므로 2 출력
		
		// 묵시적 형 변환 & 확장 형 변환
		int x = 10, y = 4;
		float f = x / y; // f = (float)(x / y)처럼 계산됨
		System.out.println(f); // 2.0 출력
		
		// boolean
		/* while (1); */ // 자바에서는 불가능함. boolean과 정수형 혼용 불가
		/*
			if (1 < 2 < 3) {} // 불가능! 1 < 2가 true 리턴, true와 3은 비교 연산 불가능
		*/
		
	}
}
