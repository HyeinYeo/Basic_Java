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
 *
 *	- 모든 예외는 Exception 클래스를 상속 받는다.
 *		ex. 사용자 정의 예외
 *			class FoolException extends Exception { }
 *	- throw vs. throws
 *		- throw
 *			예외를 적극적으로 발생시킬 때, 예외 '객체'를 던짐!, 꼭 try문 안에서 던지지 않아도 됨
 *			try{
 *				throw new FoolException();
 *			}
 *			catch(FoolException e){}
 *		
 *		- throws 
 *			어떤 메소드에서 throw 뒤에 적힌 예외를 던질 수 있다는 뜻. 예외 미루기!
 *			여러 개의 예외를 던질 경우, 콤마로 나열
 *			void func() throws FoolException, AnotherException{ }
 *
 *	- 대표적인 예외 종류
 *		ArithmeticException : 정수를 0으로 나눌 때
 *		ArrayIndexOutOfBoundsException : 배열 범위 벗어난 접근 시
 *
 *		NullPointerException : null 레퍼런스 참조 시
 *		ClassCastException : 변환할 수 없는 타입으로 객체 변환 시
 *		OutOfMemoryError : 메모리 부족한 경우
 *		IllegalArgumentException : 잘못된 인자 전달 시
 *		NumberFormatException : 문자열이 나타내는 숫자와 일치하지 않는 타입의 숫자로 변환 시
 *
 *		IOException : 입출력 동작 실패 or 인터럽트 시, 파일 읽기/쓰기/닫기하는 동안 입출력 오류 발생 시
 *		FileNotFoundException : 파일 경로명 틀린 경우
 *
 *		InterruptedException : 자바 스레드 sleep()이나 wait() 사용 시 발생하는 인터럽트 예외 처리
 *		
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
