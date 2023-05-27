/* 다차원 배열 & 정방형 배열*/
/**
 * 1. 2차원 배열
 * 		- 2차원 배열도 스택에는 레퍼런스 변수 하나만 할당됨
 * 			- 힙 영역 내에서 1차원 행 배열 원소가 열 배열 참조
 * 
 * 2. 비정방형 배열
 * 		1) 정방형 배열
 * 			- 각 행의 열 개수가 모두 동일한 배열
 * 				ex. int array[][] = new int [2][5];
 * 		2) 비정방형 배열
 * 			- 각 행의 열 개수가 서로 다른 배열
 * 			- 배열 생성 시, 행 값만 넣고 -> 열은 따로 생성
 * 			- 배열 초기화로 생성 시, 행마다 다른 개수로 초기화
 */
public class Ch03_02_2Array {
	
	public static void main(String[] args) {
		/*1. 2차원 배열*/
		// 선언과 생성
		int Array1[][] = new int [3][5]; // 정방형 배열
		int [][]Array2 = new int [3][5]; // 정방형 배열
		System.out.printf("Array1 행 개수: %d\n", Array1.length); // 3개
		System.out.printf("Array1 열 개수: %d\n", Array1[0].length); // 5개
		
		// 초기화
		int Array3[][] = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}}; // 3 * 3 2차원 배열
		for (int i = 0; i < Array3.length; i++) {
			for (int j = 0; j < Array3[i].length; j++) {
				System.out.printf("%d\t", Array3[i][j]);
			}
			System.out.print("\n");
		}
			
		/* 비정방형 배열 */
		// 배열 생성
		int Array4[][] = new int[3][];
		Array4[0] = new int [1]; // 첫 번째 행은 열 1개
		Array4[1] = new int [2]; // 두 번째 행은 열 2개
		Array4[2] = new int [5]; // 세 번째 행은 열 5개
		for (int i = 0; i < Array4.length; i++) {
				System.out.printf("Array4[%d] 열 개수: %d\n", i, Array4[i].length);
		}
		
		// 배열 초기화
		int Array5[][] = {{0, 1}, 
						  {2},
						  {3, 4, 5},
						  {6, 7, 8, 9}};
		for (int i = 0; i < Array5.length; i++) {
			System.out.printf("Array5[%d] 열 개수: %d\n", i, Array5[i].length);
		}
		
	}
}
