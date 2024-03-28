package javaEx_H;

public class H06_threadEx5 {
/*
 * 데몬 스레드
 * 일반 스레드의 보조 기능을 하는 스레드, 보통은 무한 반복하면서 일반 스레드를 보조
 * 
 * 데몬 스레드 설정 시 start() 실행하기 전에 setDaemon(true)
 * 
 */
	public static void main(String[] args) {
			
			// 스레드 객체 생성
			DaemonThread dt1 = new DaemonThread();
			DaemonThread dt2 = new DaemonThread();
			
			// 데몬스레드로 설정
			dt1.setDaemon(true);
			dt2.setDaemon(true);
			
			dt1.start();
			dt2.start();
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {}
			System.out.println("main 종료");
			
		}

	}

class DaemonThread extends Thread {
	public void run() {
		while(true) {
			System.out.println(getName());
			try {
				sleep(500);
			} catch (InterruptedException e) {}
		}
	}
}