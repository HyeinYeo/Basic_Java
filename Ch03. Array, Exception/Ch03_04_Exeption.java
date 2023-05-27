/*예외처리*/
/**
 *	try ~ catch ~ finally 구조
 *		- 다수의 catch 블록 사용 가능
 *			- 발생한 예외와 타입이 일치하는 catch 블록 실행됨
 *			- 발생한 예외와 타입이 일치하는 catch 불록 없으면 프로그램 강제 종료
 *		
 *		- finally는 예외 발생으로 종료 시 할당 메모리를 해제하는 등의 작업을 하기 위해 사용
 *			- 생략 가능
 *	---------------------------
 *	try{
 *		<예외 발생 가능성 있는 실행문>
 *	}
 *	catch(<처리할 예외 타입 선언>){
 *		<예외 처리문>
 *	}
 *	finally{
 *		<예외 발생 여부와 상관 없이 무조건 실행되는 문장>
 *	}
 */
public class Ch03_04_Exeption {
	public static void main(String[] args) {
		// 배열 범위 벗어난 경우의 예외처리
		int arr[] = new int[5]; // 인덱스 0~4까지 가능
		try {
			arr[2] = 2; // 예외 발생 X
			arr[5] = 5; // 예외 발생!
		}
		catch(ArrayIndexOutOfBoundsException e) { // 객체 e에 예외 정보 넘어옴
			System.out.println("예외 발생: 배열 범위 초과하여 원소 접근");
		}
		finally {
			System.out.println("finally절이 실행됨");
		}
	}
}
