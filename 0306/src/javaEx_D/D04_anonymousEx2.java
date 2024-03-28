package javaEx_D;
import java.awt.Frame;
import java.awt.event.WindowAdapter;


public class D04_anonymousEx2 {
	private Frame f;
	public D04_anonymousEx2() {
		f = new Frame("Anonymous Ex2");
	}
	
	WindowAdapter handler = new WindowAdapter() {
		public void windowClosing(java.awt.event.WindowEvent e) {
			System.out.println("x버튼 누름");
			System.exit(0);

		};
		
	};
	
	public void launchFrame () {
		f.addWindowListener(handler);
		f.setSize(800,600);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D04_anonymousEx2 da2 =  new D04_anonymousEx2();
		da2.launchFrame();
	}

}
