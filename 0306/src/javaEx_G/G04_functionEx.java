package javaEx_G;
import java.util.function.Function;

import obj.inheritance.goodcase.Student;

public class G04_functionEx {

	/*
	 *  Function 인터페이스는 매개변수와 리턴값이 모두 있는 추상 메서드 apply를 가지고 있음.
	 *  Function인터페이스는 주로 매개변수로 받은 값을 리턴값으로 매핑하여 사용.
	 *  
	 *    인터페이스				메서드
	 *   Function<T,R>			R apply(T t)
	 *   BiFunction<T,U,R>		R apply(T t, U u)
	 *   xxxFunction<R>			R apply(xxx x)
	 *   xxxToyyyFunction		yyy applyAs(yyy)(xxx x)	 ex) double applyAsDouble(int x)
	 *   ToxxxBiFunction<T,U>	xxx applyAsxxx(T t, U u)
	 *   ToxxxFunction<T>		xxx applyAsxxx(T t) 
	 * 
	 */

	static Student[] list = {
			new Student("홍길동", 20, "2403251", "컴공"),
			new Student("이순신", 32, "2403252", "통계")
	};

	public static void main(String[] args) {

//		System.out.print("학생명 : ");
//		printString(t -> t.getName());
//		System.out.print("전공 : ");
//		printString(t -> t.getMajor());
//		System.out.print("나이 : ");
//		printInt(t -> t.age);


	}
	// Function<Student, Integer> f = t -> t.age ;
	static void printInt(Function<Student, Integer> f) {
		for(Student s: list) {
			System.out.print(f.apply(s)+ " ");
		}
		System.out.println();
	}

	static void printString(Function<Student, String> f) {
		for(Student s : list) {
			System.out.printf(f.apply(s)+" ");
		}
		System.out.println();
	}
}