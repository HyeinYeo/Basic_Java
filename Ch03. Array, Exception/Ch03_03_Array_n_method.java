/* 배열 리턴 */
/**
 * 배열 리턴
 * 	- 배열 공간 전체가 아니라 배열에 대한 레퍼런스만 리턴됨
 * 	- 2차원 배열에 대한 리턴도 같은 방식!
 * */
 class Ch03_03_Array_n_method {
	public static int[] makeArray() {
			int temp[] = new int[4];
			return temp; // temp는 지역변수이므로 사라지지만, 레퍼런스를 넘겨주기 때문에 temp로 생성된 배열은 힙 공간에서 안 사라짐
	}
	public static void main(String[] args) {
		int Array[];
		Array = makeArray(); // makeArray 메소드가 리턴하는 배열 받음. 스택 영역의 Array 레퍼런스 변수는 힙 영역 배열을 가리킴
		System.out.printf("열 개수가 %d개인 배열", Array.length);
	}
}
