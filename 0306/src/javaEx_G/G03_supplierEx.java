package javaEx_G;

import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

//Supplier 매개변수 x 리턴 o
		/*
		 * 인터페이스			추상 메소드
		 * Supplier<T>		T.get()
		 * BooleanSupplier 	boolean.getAsBoolean()
		 * DoubleSupplier 	double.getAsDouble()
		 * IntSupplier 		int.getAsInt()
		 * LongSupplier		long.getAsLong()
		 * 
		 */
public class G03_supplierEx {
	public static void main(String[] args) {
		Supplier<String> s1 = () -> {
			return "홍길동";
		};
		System.out.println(s1.get());
		s1 = ()	-> "이순신";
		System.out.println(s1.get());
		
		IntSupplier s2 = () -> {
			int num = (int)(Math.random()*6)+1;
			return num;
		};
		
		System.out.println("주사위의 값 : "+s2.getAsInt());
		
		
		DoubleSupplier s3 =  () -> Math.PI;
		System.out.println(s3.getAsDouble());
		
		
	}
}
