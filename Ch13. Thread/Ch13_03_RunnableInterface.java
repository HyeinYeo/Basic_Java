/* Runnable 인터페이스 */
/** 
 * 2) Runnable 인터페이스
 * 		- Runnable 인터페이스 경로명: java.lang.Runnable
 * 		- Runnable 인터페이스 implements 해서 코드 작성
 * 
 * 		- 추상메소드 run() 하나만 가지고 있음
 * 		- 클래스 구현 시 run() 메소드 오버라이딩 필수
 * 		interface Runnable{
 * 			abstract public void run();
 * 		}
 * 
 * 		- 스레드 객체 생성
 * 			- Thread 클래스의 생성자 인자로 인터페이스 구현한 클래스 생성해서(객체) 보냄
 * 			Thread th = new Thread(new TimerRunnerble());
 * 		- 스레드 실행
 * 			- Thread 클래스의 start() 사용
 * 			th.start();
 * 				
 * */
import java.lang.Runnable;
//1초 단위로 초 시간을 콘솔에 출력하는 스레드
class TimerRunnable implements Runnable{
	int n = 0;
	@Override
	public void run() {
		while (true) {
			System.out.println(n);
			n++;
			try {
				Thread.sleep(1000); // Thread 클래스 상속 받은 것 아니고, sleep은 Thread 클래스의 정적 메소드이므로 이렇게 사용 가능
			}
			catch(InterruptedException e) { return;	}
		}
	}
}

public class Ch13_03_RunnableInterface {

	public static void main(String[] args) {
		Thread th = new Thread(new TimerRunnable());
		th.start();
		// 1초마다 0, 1, 2, ... 출력
	}
}
