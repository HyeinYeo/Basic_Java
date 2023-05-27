/* wait() - notify() */
/**
 * 스레드 동기화
 * 1) synchronized 동기화 블록 지정
 * 2) wait()-notify() 메소드로 스레드 실행 순서 제어
 * 
 * ---
 * 2) wait()-notify() 메소드로 스레드 실행 순서 제어
 * 		- synchronized로는 여러 개의 스레드가 공유 메모리에 동시 접근해서 덮어쓰기하고, 잘못 읽고 하는 것을 방지
 * 		- but, 생산자-소비자 문제는 아직 해결 X
 * 			- 소비자 스레드는 버퍼가 빈 경우, 생산자가 채울 때까지 기다려야 함
 * 			- 생산자 스레드는 버퍼가 꽉 찬 경우, 소비자가 사용할 때까지 기다려야 함
 * 			- wait(), notify(), notifyAll() 메소드 호출하는 함수는 synchronized로 지정되어 있어야 함!!(안 그러면 예외 발생)
 * 			
 * 		-----
 *  	- wait()
 *  		- 다른 스레드가 이 객체의 notify() 불러줄 때까지 대기
 *  	
 *  	- notify()
 *  		- 이 객체에 대기 중인 스레드를 깨워 RUNNABLE(준비) 상태로 만듦.
 *  		- 여러 개 대기 중이면, 하나만 깨움
 *  			- 깨울 스레드는 JVM이 정함
 *  
 *  	- notifyAll()
 *  		- 대기 중인 스레드 전체 다 깨움
 * */

public class Ch13_06_WaitNotify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
