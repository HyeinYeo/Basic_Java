/* String 객체 */
/**- 스트링
 * 		- String 클래스는 문자열을 나타냄
 * 		- 스트링 리터럴은 자바 컴파일러에 의해 모두 String 객체로 처리
 * 
 * 1. String 생성
 * 	- 스트링 리터럴
 * 		String str1 = "abcd";
 * 
 * 	- new String()
 * 		String str2 = new String(<문자 배열>); // char data[] = {'a', 'b', 'c', 'd'};
 * 		String str3 = new String(<스트링 리터럴>); // "abcd"
 * 
 * 		- String 클래스 생성자
 * 			- String() : 빈 스트링 객체 생성
 * 			- String(char[] value) : char 배열에 있는 문자들을 스트링 객체로 생성
 * 			- String(String original) : 매개변수로 주어진 문자열과 동일한 스트링 객체 생성
 * 			- String(StringBuffer buffer) : 매개변수로 주어진 스트링 버퍼의 문자열을 스트링 객체로 생성
 * 
 * 2. 스트링 리터럴 VS. new String()
 * 	1) 스트링 리터럴
 * 		- 자바 내부에서 리터럴 테이블(상수 풀 - 힙 영역에 있긴 함)로 특별히 관리
 * 		- 동일한 리터럴을 공유
 * 			- 스트링 생성하는 실행 시간을 줄이기 위해서
 * 			- == 연산으로 비교해도 true 나옴
 * 	
 * 	2) new String()
 * 		- 힙 메모리에 개별적으로 생성(new로 생성하는 다른 객체와 동일하게)
 * 
 * 	=> 스트링 리터럴이든 new String이든 스트링 객체는 생성되면 수정 불가능!
 * 		- 따라서 스트링 공유 가능
 * 		
 * 3. 객체 비교
 * 	1) ==
 * 		- 같은 객체 가리키고 있는지?
 * 		- 내용이 같아도 레퍼런스가 다른 객체 가리키고 있으면 false 반환
 * 
 * 	2) <객체레퍼런스>.equals(<비교대상객체>)
 * 		- 객체의 내용이 같은지? (오버라이딩 재정의로 수정 가능)
 * 
 * 4. 문자열 비교(사전순으로 앞인지 뒤인지)
 * 		<객체레퍼런스>.compareTo(<비교대상객체>)
 * 		- 두 문자열이 같으면 -> 0 리턴
 * 		- 현재 문자열이 사전순으로 먼저면 -> 음수 리턴
 * 		- 현재 문자열이 사전순으로 뒤면 -> 양수 리턴
 * 
 * 5. 문자열 연결
 * 		- + 연산자로 연결하기
 * 			<객체>.toString() 메소드가 자동적으로 호출되어 객체가 문자열로 변환됨
 * 			기본 타입 값도 문자열로 변환됨
 * 			=> 항상 new String()으로 새 객체 반환함
 * 			
 * 			** <String객체> + <String객체> 또는 <스트링리터럴> + <String객체>인 경우에는 런타임에 객체연결이 되고, new String()으로 새 객체를 반환하므로 힙 영역에 독자적으로 생성된다.
 * 			** 반면, <스트링리터럴> + <스트링리터럴>로 바로 조합할 경우 컴파일 타입에 연결이 되어 스트링 리터럴이 된다. 따라서 리터럴 테이블에 존재한다.
 * 		
 * 		- <문자열1>.concat(<문자열2>)
 * 			- 연결된 게 리턴되지만, <문자열1>과 <문자열2>는 수정이 안 됨!
 * 			=> <문자열2>의 길이가 0보다 크면 -> new String()으로 새 객체 반환
 * 				 			 0보다 작으면 -> <문자열1> 기존 객체 반환
 * */
public class Ch06_01_String {

	public static void main(String[] args) {
		// 1. 스트링 생성
		String str0 = "Happy";
		String str1 = "Happy";
		
		char data[] = {'A', 'r', 'm', 'y'};
		String str2 = new String(data);
		
		String str3 = new String("Army");
		
		String str4 = "Army";
		
		// 2. 스트링 비교
			
		// 2 - 1) 스트링 리터럴끼리 비교
		if (str0 == str1) // true
			System.out.printf("str0(%s)과 str1(%s)은 같습니다.\n", str0, str1); // str0(Happy)과 str1(Happy)은 같습니다.
		if (str0.equals(str1)) // true
			System.out.printf("str0(%s)과 str1(%s)은 같습니다.\n", str0, str1); // str0(Happy)과 str1(Happy)은 같습니다.
		
		// 2- 2) new String()끼리 비교
		if (str2 == str3) // false
			System.out.printf("str2(%s)과 str3(%s)은 같습니다.\n", str2, str3);
		else
			System.out.printf("str2(%s)과 str3(%s)은 같지 않습니다.\n", str2, str3); // str2(Army)과 str3(Army)은 같지 않습니다.
		
		if (str2.equals(str3)) // true
			System.out.printf("str2(%s)과 str3(%s)은 같습니다.\n", str2, str3); // str2(Army)과 str3(Army)은 같습니다.
			
		// 2 - 3) 스트링 리터럴과 new String() 비교
		if (str3 == str4) // false
			System.out.printf("str3(%s)과 str4(%s)은 같습니다.\n", str3, str4);
		else
			System.out.printf("str3(%s)과 str4(%s)은 같지 않습니다.\n", str3, str4); // str3(Army)과 str4(Army)은 같지 않습니다.
		
		if (str3.equals(str4)) // true
			System.out.printf("str3(%s)과 str4(%s)은 같습니다.\n", str3, str4); // str3(Army)과 str4(Army)은 같습니다.
		
		System.out.println(str1.compareTo(str4)); // 7(Happy가 Army보다 뒷 순서이므로)
		
		// 3. 문자열 변경 시도 및 연결
		String new_str = str1.concat("Cat");
		System.out.println("str1: " + str1); // str1: Happy => str1은 수정 안 됨!
		System.out.println("new_str: " + new_str); // new_str: HappyCat

	}
}
