// 실행 시작 10초 후에 자동으로 종료하는 스레드를 Runnable 인터페이스 이용하여 작성
import java.lang.Runnable;

class AutoRunnable implements Runnable{
	@Override
	public void run() {
		try {
			Thread.sleep(10000);
		}
		catch(InterruptedException e) {
			return;
		}
		System.out.println("스레드를 종료합니다.");
		return;
	}
}

public class Ch13_03_01_CheckTime {
	public static void main(String[] args) {
		Thread th = new Thread(new AutoRunnable());
		th.start();
	}
}