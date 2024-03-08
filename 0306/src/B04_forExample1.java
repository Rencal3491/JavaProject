
public class B04_forExample1 {

	public static void main(String[] args) {
		// 반복문(Loop) : for, while, do~while
		// for : 반복 회차가 정해진 경우
		/*
		 *  구문
		 * 	for (초기값; 조건; 증가값) { 
		 * 		조건이 참인 경우에 반복할 문장
		 *  }
		 */
		// 초기값은 for 문에 사용할 변수의 초기값
		
		for (int i=1; i < 201; i++) {
		System.out.println(i);
		}
//		// 초기값과 증가값의 위치는 변경가능하지만 보기 좋지않음.
//		int i = 0;
//		for(; i<10 ;) {
//			// 반복문 내에 증감값이 존재해야함
//			System.out.println(i);
//			i++;
//		}
		
		// 예제1) for문을 사용하여 1부터 10까지 숫자들의 합
//		int sum = 0;
//		for (int i=1; i < 11; i++) {
//			
//			System.out.println(i);
//			sum += i;
//			}
//
//		System.out.println("합은 " + sum);
//		
		// 예제2) for문을 사용하여 1~100까지 홀수들의 합을 구하시오
//		int sum = 0;
//		for (int i=1; i < 101; i++) {
//			if(i%2==1) {
//				sum += i;
//			}
//		}
//		System.out.println(sum);
//		
		
		
	}

}
