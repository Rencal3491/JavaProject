import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class D04_java_gui {
	//프레임 멤버 instance 변수
	private Frame f;
	public D04_java_gui() {
		f = new Frame ("inner 클래스를 위한 awt 확인 - 내부클래스");	
	}
	
	public void launchFrame() {
		f.addWindowListener(new MyWindowAdapter());
		f.setSize(640 , 480);
		f.setVisible(true);
		
	}

	
	
	
	/*
	 * java gui란 
	 * 프로그램을 그래픽화 시켜 작동시키는것
	 * awt, swing 패키지를 이용하여 프레임 구현
	 * Frame 또는 JFrme 클래스를 이용해 프레임 창을 구현 후에
	 * 각종 이벤트 처리 및  버튼, 패널, 입력창, 메뉴바, 속성 같은 구성 요소들을 클래스를 이용하여 구현
	 * 
	 * Frame(A) 클래스가 각종 구성요소 (B) 클래스들을 전부 호출
	 * 구성요소 (B)클ㄹ스들을 전부 호출 , 구성요소(B)클래스들은 각 프레임 창별로
	 * 달라지기 때문에 개별 클래스화 한다면 여러 측면에서 낭비 -> 내부클래스 사용.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D04_java_gui dj = new D04_java_gui();
		dj.launchFrame();
	}
	private class MyWindowAdapter extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("X를 클릭했어요..");
			System.exit(0);		//프로그램 종료
		}
	}
}