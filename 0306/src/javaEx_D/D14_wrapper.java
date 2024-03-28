package javaEx_D;

public class D14_wrapper {

	public static void main(String[] args) {
		//wrapper 클래스는 기본 자료형을 객체로
		Object[] arrObj = new Object[10];
		arrObj[0] = new Byte((byte)127);
		arrObj[1] = new Short((short)32767);
		arrObj[2] = new Integer(214334127);
		arrObj[3] = new Long(1234127L);
		arrObj[4] = new Float(3.5F);
		System.out.println(((Float)arrObj[4]).floatValue());
		arrObj[5] = new Double(3.7);
		System.out.println(((Double)arrObj[5]).doubleValue());
		arrObj[6] = new Boolean(true);
		arrObj[7] = new Character('j');
		arrObj[8] = new String("hello");
		arrObj[9] = new java.util.Date();
		for (int i=0; i<arrObj.length; i++) {
			System.out.println(arrObj[i]);
		}
		int a= Integer.parseInt("100"); //문자열 값을 기본 데이터형으로 변경
		System.out.println(a);
		
	}

}
