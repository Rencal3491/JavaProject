package quiz;

import java.util.Scanner;

// Airplane 클래스 정의
class Airplane {
   // 비행기 이름을 저장할 변수
   String name;

   // 생성자, 비행기 이름을 입력받음
   public Airplane() {
       Scanner sc = new Scanner(System.in); // Scanner 객체 생성
       System.out.print("비행기 이름을 입력하세요: ");
       name = sc.nextLine();
       sc.close(); // Scanner 종료
   }

   // 이륙 메소드
   public void takeOff() {
       System.out.println(name + " 비행기가 이륙합니다.");
   }
   // 비행 메소드
   public void fly() {
       System.out.println(name + " 비행기가 비행합니다.");
   }
   // 착륙 메소드
   public void land() {
       System.out.println(name + " 비행기가 착륙합니다.");
   }
}

// Airplane 클래스를 상속받는 SuperSonicAp 클래스 정의
class SuperSonicAp extends Airplane {
   // 고속 비행 모드를 나타내는 변수
   int flyMode;

   // 생성자, 비행기 이름에 따라 flyMode 값을 결정
   public SuperSonicAp() {
	   
       if (name.equals("고속비행기")) {
           flyMode = 1; // 고속 모드
       } else {
           flyMode = 0; // 일반 모드
       }
   }

   // fly() 메소드 오버라이딩
   @Override
   public void fly() {
       if (flyMode == 1) {
           System.out.println("고속 모드로 비행합니다.");
       } else {
           super.fly(); // 상위 클래스의 fly() 메소드 호출
       }
   }
}

// 메인 클래스
public class Quiz_240314_PM {
   public static void main(String[] args) {
       SuperSonicAp superSonicAp = new SuperSonicAp(); // SuperSonicAp 객체 생성
       superSonicAp.takeOff(); // 이륙
       superSonicAp.fly(); // 비행
       superSonicAp.land(); // 착륙
   }
}