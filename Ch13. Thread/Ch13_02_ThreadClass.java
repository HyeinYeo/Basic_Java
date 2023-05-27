/* Thread 클래스 */
/**
 * 1) Thread 클래스
 * 		- Thread 클래스 경로명: java.lang.Thread
 * 		- Thread 클래스 상속 받아서 스레드 코드 작성
 * 		
 * 		- 메소드
 * 			- <객체레퍼런스>.start() 
 * 				- 스레드가 생명력을 가지고 실행을 시작하도록 하는 메소드(스레드 동작시킴)
 * 				- 오버라이딩 불가!!
 * 				- 생성된 스레드 객체를 스케줄링이 가능한 상태로 전환하도록 JVM에게 지시
 * 				- 이후 스케줄링에 의해 이 스레드 선택되면 JVM에 의해 run() 메소드 호출 -> 실행
 * 
 * 			- run()
 * 				- 꼭 오버라이딩 할 것! 안 하면 Thread 클래스의 run() 실행(단순 리턴하므로 아무것도 안 나옴)
 * 				- 스레드에서 main() 같은 느낌의 역할하는 메소드. run() 실행하면 스레드 시작, 끝나면 스레드도 종료

 * 			- sleep()
 * 				- 스레드가 시간대기 상태가 되게 함
 * 				- 스레드 잠자면 JVM은 다른 스레드를 실행시킴
 * 				- 스레드 대기 시간 사이에 발생하는 InterruptedException 예외 처리할 try-catch 블록 필수!!!		
 * */

import java.lang.Thread;
// 1초 단위로 초 시간을 콘솔에 출력하는 스레드
class TimerThread extends Thread{
	@Override
	public void run() { // run() 오버라이딩 필수! => 스레드에서 main() 같은 느낌의 메소드
		int n = 0;
		while (true) {
			System.out.println(n);
			n++;
			try {
				sleep(1000); // 1초 동안 잠을 잔 후 깨어남
							// 한 스레드가 잠 자면 JVM은 다른 스레드 실행
			}
			catch(InterruptedException e) { 
				System.out.println("스레드를 종료합니다."); 
				return;	// 예외 발생 시, 스레드 바로 종료
			} 
		}
	}
}

public class Ch13_02_ThreadClass  {
	public static void main(String[] args) {
		TimerThread th = new TimerThread();
		th.start();
		// 1초마다 0, 1, 2, ... 출력
		
		//th.interrupt(); // 인터럽트 발생시켜서 스레드 강제종료
	}

}