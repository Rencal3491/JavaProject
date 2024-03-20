interface Myinterface1 {
	default void defaultmethod() {
		System.out.println("my interface1의 default 메소드");
	}
	static void staticMethod() {
		System.out.println("my interface1의 static 메소드");
	}
	
}
interface Myinterface2 {
	default void defaultmethod() {
		System.out.println("my interface2의 default 메소드");
	}
	static void staticMethod() {
		System.out.println("my interface2의 static 메소드");
	}
	
}

class Parent1 {
	public void method2() {
		System.out.println("Parent 클래스의 method2");
	}
}
class child1 extends Parent1 implements Myinterface1, Myinterface2 {

	@Override
	public void defaultmethod() {
		System.out.println("Child 클래스의 default 메소드");
		
		Myinterface1.super.defaultmethod();
		Myinterface2.super.defaultmethod();
		
	}
	
}

public class D05_default_interface {

	public static void main(String[] args) {
		child1 c = new child1();
		c.defaultmethod();
		c.method2();
		Myinterface1.staticMethod();
		Myinterface2.staticMethod();
	}

}
