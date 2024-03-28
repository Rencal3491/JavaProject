package javaEx_D;

public class D17_string_stingbuilder {

	public static void main(String[] args) {
		long start,end;
		start = System.currentTimeMillis();
		System.out.println("시작시간 : "+ start);
		String str = "A"; //String 은 값이 변경될때마다 새로운 객체 생성
		for (int i=0; i<300000; i++) {
			str = str + "A";
		}
		end = System.currentTimeMillis();
		System.out.println("String : " + (end-start)*0.001 + "초");
		
		//StringBuilder A 붙이기
		start = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder("A");
		for (int i=0; i<300000; i++) {
			sb.append("A");
		}
		end = System.currentTimeMillis();
		System.out.println("StringBuilder : " + (end-start)*0.001 + "초");
	}

}
