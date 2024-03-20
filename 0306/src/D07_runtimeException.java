
public class D07_runtimeException {

	public static void main(String[] args)throws Exception {
		//Runtime Exception => unchecked exception
//		makeException1(3);
//		makeException2();
//		try {makeException3();}
//		catch (Exception e) {
//			System.out.println("예외");
//		makeException4();
//		makeException5();
//		makeException6();
//		makeException7();
		makeException8();
	}
	public static int makeException1(int input) {
		int divide = 0;
		int res = input/divide;
		return res;
	}
	public static void makeException2() {
		String s = "가";
		System.out.println(s.charAt(1));
	}
	public static void makeException3() throws Exception {
		int [] a= {1,2,3};
		System.out.println(a[3]);
	}
	public static void makeException4() {
		String nothing = null;
		System.out.println(nothing.split(""));
	}
	public static void makeException5() {
		String notInt = "가나다";
		int a = Integer.parseInt(notInt);
	}
	public static void makeException6() {
		for(int i=0; i<Integer.MAX_VALUE; i++) {
			makeException6();
		}
	}
	public static void makeException7() {
		Object[] objArr = new String[3];
		objArr[0] = 0;	//에러 밑줄이 표시되지 않음
		//선언 자체가 Object로 되어있어서 컴파일 오류를 발생 x
	}
	public static void makeException8() {
		Object[] objArr = new String[3];
		objArr[0] = "0";
		Integer a = (Integer) objArr[0];
	}
}
