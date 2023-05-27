// 실행 시작 10초 후에 자동으로 종료하는 스레드를 Thread 클래스 이용하여 작성
import java.lang.Thread;

class AutomaticThread extends Thread{
	int n = 0;
	@Override
	public void run() {
		/*
		while (n <= 10) {
			System.out.println(n);
			n++;
			try {
				sleep(1000);
			}
			catch(InterruptedException e) {
				return;
			}
		}
		*/
		try {
			sleep(10000);
		}
		catch(InterruptedException e) {
			return;
		}
		System.out.println("스레드를 종료합니다.");
		return;
	}
}
public class Ch13_02_01_CheckTime {

	public static void main(String[] args) {
		AutomaticThread th = new AutomaticThread();
		th.start();
	}

}
