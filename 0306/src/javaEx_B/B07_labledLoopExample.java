package javaEx_B;

public class B07_labledLoopExample {

	public static void main(String[] args) {
		// labeled loop
		// 루프 앞에 이름 지정 후  ":"
		outer: for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(j == 2) {
//					break outer;	//레이블이 outer인 반복문을 종료			
					continue outer;
				}
				System.out.println(i+ "\t" +j);
			}
		}
		
	}

}
