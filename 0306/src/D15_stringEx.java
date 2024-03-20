import java.util.Arrays;

public class D15_stringEx {

	public static void main(String[] args) {
		// String 메소드 사용 예시
		String str = "Hello, world!! 1234567890";
		System.out.println(str);
		
		// 1. substring - 문자열을 원하는 인덱스 이후로 출력하는 메소드
		System.out.println(str.substring(0));
		System.out.println(str.substring(1));
		System.out.println(str.substring(2));
		System.out.println(str.substring(3));
		System.out.println(str.substring(4));
		System.out.println(str.substring(5));
		System.out.println(str);
		// x번인덱스부터 y번 인덱스 이전까지만 출력
		System.out.println(str.substring(0,5));  
		System.out.println(str.substring(7,12)); 
		System.out.println("======================================================");
		
		// 2. split - 문자열을 원하는 기준으로 자른다 -> 배열로 변환됨
		str = "apple/banana/kiwi/lemon/orange";
		String[] fruit = str.split("/");
		for (int i=0; i<fruit.length; i++) {
			System.out.println(fruit[i]);
		}
		System.out.println(Arrays.toString(fruit));
		System.out.println("======================================================");
		
		// 3. indexOf - 원하는 문자의 인덱스 위치값을 반환 (못찾을 경우 -1)
		int orangeIndex = str.indexOf("orange");
		System.out.println("오렌지 위치 : " + orangeIndex);
		System.out.println("첫번째 o의 위치 :" + str.indexOf('o'));
		System.out.println("두번째 o의 위치 :" + str.indexOf('o', str.indexOf('o')+1));
		// 못찾을 경우 -1
		System.out.println("첫번째 x의 위치 :" + str.indexOf('x'));
		System.out.println("======================================================");
		
		// 4. charAt - 원하는 위치의 문자를 가져옴
		char ch = str.charAt(str.indexOf("orange"));
		String orange = str.substring(
						str.indexOf("orange"), 
						str.indexOf("orange") + "orange".length());
		
		System.out.println(ch);
		System.out.println(orange);
		System.out.println("======================================================");
		
		// 5. contains - 해당 문자가 문자열에 포함되어 있는 경우
		if(str.contains("apple")) {
			System.out.println("사과도 과일이군요.");
		} else {
			System.out.println("사과는 과일이 아니군요");
		}
		// 6. length() - 문자열 길이, equals() - 문자열 비교
		System.out.println("======================================================");
		
		// 7. replace - 원하는 문자를 치환함
		str = "abc@naver.com";
		System.out.println(str);
		str = str.replace("naver", "gmail");
		System.out.println(str);
		str = str.replaceFirst("gmail", "korea");
		System.out.println(str);
		System.out.println("======================================================");
		
		// 8. lastIndexOf - 해당 문자열을 뒤에서부터 찾아서 위치 반환
		str = "abcd    dcba";
		System.out.println("indexOf(d) : " + str.indexOf('d'));
		System.out.println("indexOf(d) : " + str.lastIndexOf('d'));
		System.out.println("======================================================");
		
		// 9. toUpperCase , toLowerCase - 대소문자 변환
		// 10.trim - 문자열 바깥 공백 제거
		String id_1 = "     abc     123   ";
		String id_2 = "  abc    123    ";
		System.out.println("Before 1 : " + id_1);
		System.out.println("Before 1 : " + id_2);
		System.out.println("equals : " + id_1.equals(id_2));
		id_1 = id_1.trim();
		id_2 = id_2.trim();
		System.out.println("After 1 : " + id_1);
		System.out.println("After 1 : " + id_2);
		System.out.println("equals : " + id_1.equals(id_2));
		System.out.println("======================================================");
		
		// 11. format - 서식 문자열을 이용하여 문자열을 만들어 반환
		str = String.format("%d:%d:%d",11,14,50);
		System.out.println(str);
		System.out.println("======================================================");
		
		// 12. endsWith - 지정된 문자로 끝나는지 검사 (확장자 체킹용)
		str = "오늘할일.html";
		if(str.endsWith(".txt")) {
			System.out.println("확장자가 올바릅니다");
		} else if (str.endsWith("html")|| str.endsWith("htm")) {
			System.out.println("웹 페이지입니다");
		} else {
			System.out.println("텍스트 파일이 아닙니다");
		}
		
	
	}
}
