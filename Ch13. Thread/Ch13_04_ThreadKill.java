/* 스레드 종료 */
/**
 * 1) 스스로 종료
 * 
 * 2) 강제 종료
 * 		<객체레퍼런스>.interrupt(); 
 * 		- 실행 시, 예외 처리 코드에서 종료
 * 
 * 3) flag 종료
 * 		<객체레퍼런스>.finish();
 * 		- 한 스레드가 다른 스레드를 강제로 종료
 * */

// 1초 단위로 초 시간을 콘솔에 출력하는 스레드
class TimerThread2 extends Thread{
	private int n = 0;
	
	// 3) flag 종료
	private boolean flag = false; // false로 초기화 
	public void finish() {
		flag = true;
	}
	@Override
	public void run() { 
		
		while (true) {
			System.out.println(n);
			n++;
			try {
				sleep(1000); // 1초 동안 잠을 잔 후 깨어남
				
				// 3)
				if (flag == true) {
					System.out.println("스레드를 종료합니다."); 
					return;
				}
			}
			catch(InterruptedException e) { 
				System.out.println("스레드를 종료합니다."); 
				return;	// 예외 발생 시, 스레드 바로 종료
			}
			
		}
	}
}

public class Ch13_04_ThreadKill  {
	public static void main(String[] args) {
		TimerThread2 th = new TimerThread2();
		th.start(); // 1초마다 0, 1, 2, ... 출력
		
		// 2) 강제 종료
		// th.interrupt(); // 인터럽트 발생시켜서 스레드 강제종료
		
		// 3) flag 종료
		th.finish();
	}

}