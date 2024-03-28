package javaEx_C;

public class C00_ReferencePriExample {

	public static void main(String[] args) {
		//참조형 객체 비교
		
		//문자열 비교
		String str1 = "asdf";
		String str2 = "asdf";
		System.out.println(str1==str2);
		//new 를 이용한 비교
		String str3 = new String("hello");
		String str4 = new String("hello");
		System.out.println(str3==str4);
		//문자열 비교는 equals() 사용
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1.equals(str4));
	}

}
