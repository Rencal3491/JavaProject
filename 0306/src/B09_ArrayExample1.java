import java.util.Arrays;

public class B09_ArrayExample1 {

	public static void main(String[] args) {
		// 배열
		// 같은 타입의 변수여러개를 한번에 선언하는 방법
		
		// 배열의 선언 방법
		// 1. 타입[] 변수명 = new 타입명[배열의 길이]
		// 2. 타입[] 변수명 = {데이터들};
		// 3. 타입[] 변수명 = new 타입명[] {데이터들};
		int[] nums = new int[10]; //정수 10개의 변수를 저장가능한 배열
		boolean[] win = {true,false,false,false,false}; // 불린 타입의 변수 5개 지정 및 초기화
		String[] welcome = new String[] {
				"오늘 뭐 드셨어요 ?", //0번인덱스
				"오늘 저녁에 비온대요",//1번인덱스
				"졸리죠?"			  //2번인덱스
		
		};
		// 배열의 인덱스 : 배열에 저장된 값을 불러올 때에 인덱스 값을 사용.
		//				인덱스 값은 시작값이 0부터이다
		System.out.println(welcome[0]);
		System.out.println(welcome[1]);
		System.out.println(welcome[2]);
		System.out.println("welcome의 배열의 길이 : " + welcome.length);
		System.out.println("nums의 배열의 길이 : " + nums.length);		
		System.out.println("win의 배열의 길이 : " + win.length);	
		System.out.println("문자열의 길이 : " + welcome[1].length());
		
		char[] s;
//		char[5]s2;			
		//배열 선언시 크기를 명시 할 수 없음
		s = new char[5];
		s[0] = 'A'; s[1] = 'B'; s[2] = 'C'; s[3] = 'D'; s[4] = 'E';
		for (int i=0; i<s.length; i++) {
			System.out.print(s[i]);
		}
		System.out.println();
		System.out.printf("%s",String.valueOf(s));
		
		// Enchanced For문
		/*
		 *  (형식)
		 *  for (변수명:배열명) {  배열명으로 불러오는 배열의 타입은 이전의 타입과 같아야함
		 *     반복시 실행할 명령문
		 *     }
		 */
		System.out.println("\n\n강화된 for를 이용한 반복 처리");
		for (String str : welcome) { //welcome은 string[] 
			System.out.println(str);
		}
		for (boolean result:win) {
			System.out.println("승률 : "+(result ? "승":"패"));
		}
		for (int i=0; i<win.length; i++) {
			if(win[i]) {
				System.out.println(i+1+"번째 전적 : 승리");
			} else {
				System.out.println(i+1+"번째 전적 : 패배");
			}
		}
		System.out.println("배열의 내용 출력  : Arrays.toString() 메소드 사용" );
		System.out.println(welcome);
		System.out.println(Arrays.toString(welcome));
		System.out.println(Arrays.toString(win));
		System.out.println(Arrays.toString(nums));
		
		// 배열 선언 시 자동적으로 기본값으로 초기화
		// 정수:0 , 실수:0.0, boolean : false , 참조형:null
		String[] byeMessage = new String[10];
		System.out.println(Arrays.toString(byeMessage));
		
		// 배열의 복사
		// 배열의 얕은 복사(shallow copy), 
		String[] byeMessage2 = new String[] {
				"good bye",
				"bye bye",
				"see you"
		};
		//1. 얕은복사는 byeMessage 변수에 byeMessage2의 주소값을 대입 *원본 데이터 위치랑 같아짐*
//		byeMessage = byeMessage2;
//		byeMessage[1] = "hello bye bye";
//		System.out.println(Arrays.toString(byeMessage));
//		System.out.println(Arrays.toString(byeMessage2));
		
		//2.깊은 복사(deep copy)
		// System.arraycopy(src,srcPos, dest, destPos , length)
		// src : 원본 배열의 이름
		// srcPos : 복사를 시작할 원본의 위치(인덱스)
		// dest : 붙여넣기할 배열의 이름
		// destPos : 붙여넣기를 시작할 위치
		// length : 복사를 몇개나 할 것인지 결정
		
		System.out.println("복사 전 = " + Arrays.toString(byeMessage));
		System.arraycopy(byeMessage2, 1, byeMessage, 5, 2);
		System.out.println("복사 후 = " + Arrays.toString(byeMessage));
		System.out.println("복사 후 = " + Arrays.toString(byeMessage2));
		
		byeMessage[0] = "good bye~~!";
		
		System.out.println("복사 후 = " + Arrays.toString(byeMessage));
		System.out.println("복사 후 = " + Arrays.toString(byeMessage2));
		
		//깊은 복사를 통해서 byeMessage 에 byeMessage2의 배열의 값을 모두 복사하려 한다면
		System.arraycopy(byeMessage2, 0, byeMessage, 0, byeMessage2.length);
		System.out.println("복사 후 = " + Arrays.toString(byeMessage));
		
		
	} 
	

}
