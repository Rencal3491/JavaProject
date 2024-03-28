package javaEx_C;
import obj.Pen;
public class C01_Class2 {

	public static void main(String[] args) {
		// 인스턴스 객체 생성
		
		// 객체 생성 명령어 
		// ClassName instanceName = new Constructor();   - 생성자는 클래스 이름과 같은
		// 생성자의 역할은 멤버변수(속성) 초기화 혹은 클래스 구동을 위한 사전 동작을 구현
		
		Pen redPen = new Pen();
		redPen.color = "red";
		System.out.println(redPen);
		System.out.println(redPen.color);
		redPen.write();
		
		//기본 생성자를 통한 인스턴스 객체 생성
		Pen pen1 = new Pen();
		System.out.println(pen1);
		System.out.println(pen1.color);
		
		//멤버 초기화 생성자를 통한 인스턴스 객체 생성
		Pen pen2 = new Pen("blue");
		System.out.println(pen2);
		System.out.println(pen2.color);
		
		Pen pen3 = new Pen("yellow");
		System.out.println(pen3);
		System.out.println(pen3.color);
		
		//멤버 초기화 생성자를 통한 인스턴스 객체 - 색상 가격
		Pen pen4 = new Pen("pink",1000);
		System.out.println(pen4);
		System.out.println(pen4.color);
		System.out.println(pen4.getPrice());
		
	}
	

}
