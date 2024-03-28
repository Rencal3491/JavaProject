package javaEx_D;

public class D07_multicatch {
	public static int divide(int a, int b) {
		return a/b;
		
	}
	public static void doSomething(int a) throws Exception {
		if(a>50) {
			throw new Exception("a가 50보다 큼");
			
		}
		System.out.println("50% 확률로 작동됨");
		
	}
	public static void main(String[] args) {
		
		int a = (int)(Math.random()*100);
		int b = (int)(Math.random()*4);
		
		
		try {
			System.out.printf("a = %d, b= %d, result = %d", a,b,divide(a, b));
		} catch (ArithmeticException ae) {
			System.out.println("0으로 나누려 하고 있습니다.");
			System.out.println(ae.getMessage());
		} catch (Exception e) {
			System.out.println("예외발생");
			System.out.println(e.getMessage());
		}

	}

}
