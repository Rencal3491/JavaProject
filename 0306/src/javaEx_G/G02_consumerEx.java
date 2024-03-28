package javaEx_G;

import java.io.ObjectInput;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class G02_consumerEx {

	//자바의 표준 api에서 한개의 추상 메서드를 가진 인터페이스들은 모두 람다식으로 사용가능
	//람다에 사용되는 함수적 인터페이스를 java.util.function 패키지에 설정해서 사용
	//인터페이스 종류 5가지
	// Consumer - 매개변수o 리턴값 x
	// Supplier - 매개변수x 리턴값 o
	// Function - 매개변수o 리턴값 o
	// Operator - 매개변수o 리턴값 o (연산결과)
	//Predicate - 매개변수o 리턴값 boolean
	
	// Consumer<T> - 추상메소드 void accept (T t)
	// BiConsumer<T,u> - 추상메소드 void accept (T t, U u)
	// xxxConsumer
	// objxxxConsumer - 객체와 기본 타입의 매개변수를 받는 Consumer
	public static void main(String[] args) {
		Consumer<String> c11 = name -> System.out.println("제 이름은 "
				+ name +"입니다");
		c11.accept("홍길동");
		BiConsumer<String , Integer> c12 = (name , age) -> {
			System.out.println("제 이름은 "+ name + "이고" + " 나이는 " +age+"입니다" );
		};
		c12.accept("줘민준", 25);
		DoubleConsumer c13 = (score) -> System.out.println("제 점수는요 " +score+"점 입니다");
		c13.accept(98.6);
		ObjIntConsumer<String> c14 = (lecture, i) -> {
			System.out.println("제 " + lecture + "의 점수는 " + i + "입니다");
		};
		c14.accept("자바", 90);
	}

}
