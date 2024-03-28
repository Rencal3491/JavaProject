package javaEx_C;
import obj.modifier.Super;

public class Sub extends Super {
	private int num5 = 50;
	
	
	public void print() {
		System.out.println("Super num1 : " + num1);
		System.out.println("Super num2 : " + num2);
		//System.out.println("Super num3 : " + num3);			//default - 같은 패키지 내에서만 가능
		//System.out.println("Super num4 : " + num4);			//private - 같은 클래스 내에서만 가능
		System.out.println("Super num4 : " + getNum4());	//getter를 사용했으므로 가능
		System.out.println("Super num5 : " + num5);
	}
	
}

