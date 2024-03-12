/*
 * 여러줄주석
 *  
 *  새 프로젝트 생성
 *  file -> new -> java project -> 프로젝트 이름 입력
 *  
 *  클래스 파일 생성
 *  src(소스 폴더) -> 우클릭  -> new -> class -> 클래스 이름 지정
 *  
 *  자바 특징 
 *  OOP (객체 지향 프로그래밍, object oriented programming)
 *  여러 객체들이 서로 상호작용하여 프로그래밍함
 *  플랫폼 독립적(아키텍쳐 중립적, 어느 플랫폼에서든 동작)
 *  멀티스레드 지원
 *  인터프리터 언어 - 인터프리터와 컴파일을 동시에 실행
 *  
 *  단축키
 *  Ctrl + f11 빌드(컴파일+실행)
 *  탭 - 들여쓰기,간격맞추기
 *  쉬프트+탭 역탭
 *  Ctrl + z 되돌리기
 *  Ctrl + y 되돌리기 취소
 *  Ctrl + m 화면 확장
 *  Ctrl + / 블록 주석처리
 *  Ctrl + shift + / 블록영역 주석처리
 *  
 *  블록지정 관련
 *  home 줄의 앞으로 커서이동
 *  end 뒤로 이동
 *  shift 누른채로 커서이동 -블록지정
 *  
 *  오류에 커서 이동후 f2 - 에러 확인
 *  
 *  
 */
//자바에서 퍼블릭 클래스 이름은 파일명과 같아야 함

public class A01_HelloWorld { // {} 중괄호 블럭은 명령어가 묶여있는 부분
	
	// main() 메소드 - 프로그램의 시작 위치
	public static void main(String[] args) {
		// ;(세미콜론) <-명령어의 끝
		System.out.println("안녕하세요");
		System.out.println("Hello World");
		System.out.println("12345");
		System.out.println("10.1101"); // "" 문자열
		System.out.println(1234); // 정수형
		System.out.println(); // 아무것도 입력안하면 줄바꿈
		System.out.println('A'); // 문자형 (하나의 글자만 존재)
		System.out.println(10.11011); // 소수 - 실수형
	}
}
