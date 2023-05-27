/* 배열 개념 */
/**
 *	1. 배열 선언과 생성
 *		- 배열에 대한 레퍼런스 변수 선언
 *		  : 컴파일 타임에 스택 영역에 배열에 대한 레퍼런스 변수 
 *		- 배열 생성 - 배열 저장 공간 할당
 *		  : 런 타임에 힙 영역에 실제 배열 공간 할당
 *			원소에 접근하기 위해선 배열 공간이 할당되어 있어야 함 -> 아니면 오류
 *
 *	2. 배열 초기화
 *		- 배열 선언과 동시에 초기화 가능.
 *		- 초기화한 리터럴 개수만큼 배열 길이 결정됨
 *
 *	3. 레퍼런스 치환과 배열 공유(얕은 복사)
 *		- 스택 영역에 있는 레퍼런스 변수가 같은 힙 영역 배열을 가리키게 됨
 *		- 배열에 대한 주소(레퍼런스)만 복사되는 것
 *
 *	4. 배열 크기 length 필드
 *		- arr.length
 *		  : 메서드가 아니라 필드이기 때문에 함수 괄호 안 붙음에 주의
 *	
 *	5. for-each문
 *		- 배열의 크기만큼 루프를 돌면서 각 원소를 순차적으로 접근하는 for문
 *			파이썬의 for i in array와 유사
 *		- 배열뿐만 아니라 enum 자료형에도 사용 가능
 */
public class Ch03_01_Array {
	public static void main(String[] args) {
		// 레퍼런스 변수 선언
		int intArray1[]; // 스택 영역에 레퍼런스 변수만 할당됨(아직 배열 공간 할당 X, 값 넣기 불가)
		int [] intArray2;
		// int intArray[5]; // 선언 시 배열 크기 지정 X
		

		// 배열 생성
		intArray1 = new int[5]; // 힙 영역에 배열 공간 생성 할당
		
		// 배열 선언과 동시에 생성
		int array[] = new int [8];
		
		// 초기화
		int array2[] = {1, 2, 3, 4, 5};
		double array3[] = {2.0, 5.7, 8.8};
		
		// 레퍼런스 치환
		int arrA[] = new int[5];
		int arrB[] = arrA; // 레퍼런스 치환. arrB는 arrA와 동일한 배열 참조.
		
		// for-each문
		int myArray[] = {1, 2, 3, 4, 5};
		int sum = 0;
		for (int k : myArray) { // 파이썬의 for k in myArray와 같음
			sum += k;
		}
		System.out.println(sum); // 배열 원소의 총합인 15 출력
	}
}
