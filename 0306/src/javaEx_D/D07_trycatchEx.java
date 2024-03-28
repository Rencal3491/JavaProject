package javaEx_D;

public class D07_trycatchEx {

	public static void main(String[] args) {
		int i= 0;
		String[] greetings = {"안녕하세요,","반갑습니다.","또 오세요"};
		while (i<4) {
			try {
				System.out.println(greetings[i]);
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("예외가 발생했습니다");
				System.out.println("원인은" + e.getMessage());
				System.out.println("예외처리 끝");
			}finally {
				System.out.println("finally는 항상 실행됨");
			}
			i++;
		}
		System.out.println("main의 마지막입니다");
	}

}
