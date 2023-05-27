/* synchronized 동기화 블록 */
/**
 * 스레드 동기화
 * 1) synchronized 동기화 블록 지정
 * 2) wait()-notify() 메소드로 스레드 실행 순서 제어
 * 
 * ---
 * 1) synchronized 동기화 블록 지정
 * 	- synchronized 블록은 들어갈 때 lock이 걸리고, 나올 때 lock이 자동적으로 풀리도록 컴파일
 * 	- 스레드가 synchronized 블록 실행하는 순간, 그 블록에 대한 모니터를 소유하게 됨.
 * 	  모니터를 먼저 점유한 스레드가 모니터 내놓을 때까지 다른 스레드는 대기
 * 
 * 	i) 하나의 메소드를 통째로 임계영역 지정
 * 		synchronized void add(){
 * 			int n = getCurrentSum(); // 현재 합
 * 			n += 10;
 * 			setCurrentSum(n); // 증가 결과 기록
 * 		}
 * 
 * 	ii) 코드 블록을 임계영역으로 지정
 * 		void execute(){
 * 			...
 * 			synchronized(this){
 * 				int n = getCurrentSum(); // 현재 합
 * 				n += 10;
 * 				setCurrentSum(n); // 증가 결과 기록
 * 			}
 * 			...
 * 		}
 * 		- synchronized(this)
 * 			- synchronized 블록에서 인자로 주어진 객체(this)와 연계된 lock을 사용하도록 개발자가 지정한 것
 * 			- this 말고 다른 객체의 레퍼런스 사용 가능
 *				-> 이러면 그 객체가 lock과 연계됨
 * */

// 집계판 공유하는 스레드

// 집계판 클래스
class SharedBoard{
	private int sum = 0; // 집계판 숫자
	
	/** i) 하나의 메소드를 통째로 임계영역 지정*/
	
	synchronized public void add() { // 집계판 숫자 증가시키기
		int n = sum;
		Thread.yield();
		n += 10;
		sum = n; // 증가한 값을 집계판에 기록
		System.out.println(Thread.currentThread().getName() + " : " + sum);
	}
	
	/** ii) 코드 블록을 임계영역으로 지정*/
	/*
	public void add() { // 집계판 숫자 증가시키기
		synchronized(this) {
			int n = sum;
			Thread.yield();
			n += 10;
			sum = n; // 증가한 값을 집계판에 기록
			System.out.println(Thread.currentThread().getName() + " : " + sum);
		}
	}
	*/
	
	public int getSum() {
		return sum;
	}
}

// 스레드 클래스
class StudentThread extends Thread{
	private SharedBoard board;
	public StudentThread(String name, SharedBoard board) { // 스레드 이름, 사용하고자 하는 집계판
		super(name);
		this.board = board;
	}
	
	// 집계판 10번 접근하여 값 10씩 증가시킴
	@Override
	public void run() {
		for (int i = 0; i < 10; i++)
				board.add();
	}
}

public class Ch13_05_synchronized {
	public static void main(String[] args) {
		// 공유 집계판 객체 생성
		SharedBoard board = new SharedBoard();
		
		// 집계판 공유하는 스레드 2개
		StudentThread th1 = new StudentThread("김연아", board);
		StudentThread th2 = new StudentThread("손흥민", board);
		
		th1.start();
		th2.start();
		
		// 동기화 됐을 때: 0에서 10씩 10번 더하므로, 10씩 커지고, 총합 200이 되어야 함
		/*
		 *  김연아 : 10
			김연아 : 20
			김연아 : 30
			김연아 : 40
			김연아 : 50
			손흥민 : 60
			손흥민 : 70
			손흥민 : 80
			손흥민 : 90
			손흥민 : 100
			손흥민 : 110
			손흥민 : 120
			손흥민 : 130
			손흥민 : 140
			손흥민 : 150
			김연아 : 160
			김연아 : 170
			김연아 : 180
			김연아 : 190
			김연아 : 200
		 * */
		// 동기화 안 됐을 때
		/*
		    김연아 : 20	// 10이 없어짐
			김연아 : 30
			김연아 : 40
			김연아 : 50
			손흥민 : 20   // 60이 되어야 하는데 20
			김연아 : 60	// 숫자가 제멋대로 더해짐
			손흥민 : 70
			김연아 : 80
			손흥민 : 90
			손흥민 : 110
			김연아 : 100
			김연아 : 130
			김연아 : 140
			손흥민 : 120
			김연아 : 150
			손흥민 : 160
			손흥민 : 170
			손흥민 : 180
			손흥민 : 190
			손흥민 : 200
		 * */

	}

}
