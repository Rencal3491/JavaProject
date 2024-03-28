package javaEx_H;

import java.util.Iterator;

public class H02_threadEx {

	public static void main(String[] args) {
		/*
		 * 1.Thread 클래스를 상속하는 방법
		 * 2.Runnable 인터페이스를 구현한 객체를 Thread객체에 넣어주는 방식
		 */
		//스레드 생성
		
		//Thread 상속
		ThreadExtend t1 = new ThreadExtend();
		//Runnable 구현
		Runnable r = new RunnableImpl();
		Thread t2 = new Thread(r);
		//익명함수 이용해서 구현
		Thread t3 =  new Thread(new Runnable() {	
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i=0; i<50; i++) {
					System.out.println("t3 : " + i);			
				}
			}
		});
		Thread t4 = new Thread(() -> {
			for (int i=0; i<50; i++) {
				System.out.println("t4 : " + i);
			}
		});
		
		/*
		 * 스레드 우선순위
		 * 스레드가 가질 수 있는 우선 순위는 1~10 사이의 숫자로 10이 가장 높은 우선순위
		 * 스레드의 우선순위는 상대적인 수치임
		 * 우선 순위에 따라서 점유시간과 자원 할당
		 * 
		 * 적용방법 - setProperty(int) 1~10
		 * 주의사항
		 * 
		 * 우선순위 적용시 주의 사항
		 * 1.우선순위는 상대적 값
		 * 2.스레드를 실행하기 전에 지정
		 * 3.main()메소드에서 실행하는 스레드의 경우 기본값 5
		 * 4.직접 스레드의 우선 순위값을 설정하는것 보다 thread의 static final
		 * 필드 값을 이용하는것이 더 좋음
		 */
		//우선순위 지정(1~10 상수값 이용)
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.NORM_PRIORITY);
		t4.setPriority(Thread.NORM_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		System.out.println("메인 스레드 종료");
	}
}
class ThreadExtend extends Thread {
	@Override
	public void run() {
		System.out.println("Thread 상속 방법 : ");
		for (int i=0; i<50; i++) {
			System.out.println("t1 : " + i);
			
		}
	}
}

class RunnableImpl implements Runnable {
	@Override
	public void run() {
		System.out.println("Runnable 인터페이스로 실행 방법 : ");
		for (int i=0; i<50; i++) {
			System.out.println("t2 : " + i);
			
		}
	}
}