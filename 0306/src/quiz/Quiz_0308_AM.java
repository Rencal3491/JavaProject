package quiz;
import java.util.*;

public class Quiz_0308_AM {

	public static void main(String[] args) {
		//quiz1
		//1~101 미만의 임의 정수를 생성하고, 그 숫자가 짝수인지 홀수인지 출력 (3항 연산식 사용)
		
//		int jumsu = (int)(Math.random()*100+1);
//		System.out.println(jumsu);
//		if ((jumsu%2)==0 ) {
//			System.out.println("짝수에요");
//		} else {
//			System.out.println("홀수에요");
//		}
		
		//quiz2
		//-5 ~ 5 사이의 임의 정수를 생성하고, 삼항연산식을 사용하여 절댓값을 출력
//		int num = 5-(int)(Math.random()*11);
//		System.out.println("정수는" + num );
//		int res = (num >=0 ? num : -num);
//		System.out.println(num + "의 절댓값은 " + res);
		
		//quiz3
		//정수를 입력받아 그 수가 짝수 인지 홀수인지 출력 삼항연산식 사용
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수를 입력");
//		int num = sc.nextInt();
//		String res = num%2 == 0 ? "짝수" : "홀수";
//		System.out.println(num + "은 " + res);
		
		//quiz4
		//키와 나이를 입력받아서 놀이기구에 탑승여부 출력
		//(조건 : 키 140이상, 나이 10살 이상)
//		Scanner sc = new Scanner(System.in);
//		System.out.println("키 입력");
//		int hei = sc.nextInt();
//		System.out.println("나이 입력");
//		int age = sc.nextInt();
//		
//		if (hei >= 140){
//			if(age >= 10) {
//				System.out.println("탑승가능");
//			}				
//			else {
//			System.out.println("탑승불가");
//			           }
//		else {
//			System.out.println("탑승불가");
//		}
	
		//quiz5
		//정수 두개를 입력받아 더 큰 수를 출력하고 같으면 같다고 출력 
//		Scanner sc = new Scanner(System.in);
//		System.out.println("1번 정수 입력");
//		int num1 = sc.nextInt();
//		System.out.println("2번 정수 입력");
//		int num2 = sc.nextInt();
//		
//		if (num1>num2) {
//			System.out.println((num1) + "이 " + (num2) + "보다 큽니다" );
//
//		}
//			else if (num1<num2) {
//				System.out.println((num1) + "이 " + (num2) + "보다 작습니다" );
//			}
//			else {
//				System.out.println((num1) + "이 " + (num2) + "이랑 같습니다" );
//			}	
//		}
		
		
		//quiz6
		//정수를 입력받아 양의 정수인 경우 짝수,홀수를 구분하고 0이면 0입니다를 출력,
		//음수인 경우 음의 정수입니다 출력      
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수 입력");
//		int num = sc.nextInt();
//		
//		if(num==0){
//			System.out.println("0이에요");
//		}
//		else if(num<0) {
//			System.out.println("음수에요");
//		}
//		else if (num%2==0 ) {
//			System.out.println("짝수에요");
//		} 
//		else if(num%2==1)  {
//			System.out.println("홀수에요");
//		}
//		else {
//			System.out.println("잘못 입력");
//		}
//			} 
//		}
		//quiz7
		//scanner를 사용하여 메뉴를 입력받고 가격 출력
		//switch를 사용하여 수박, 사과, 멜론, 포도, 귤 을 구매시 지불금액 출력

//		Scanner sc = new Scanner(System.in);
//		System.out.println("과일 입력");
//		String menu = sc.next();
//		
//		switch(menu) {
//		case "수박":
//			System.out.println("수박의 가격은 10000원");
//			break;
//		case "사과":
//			System.out.println("사과의 가격은 9000원");
//			break;
//		case "멜론":
//			System.out.println("멜론의 가격은 8000원");
//			break;
//		case "포도":
//			System.out.println("포도의 가격은 7000원");
//			break;
//		case "귤":
//			System.out.println("귤의 가격은 6000원");
//			break;
//		default :
//			System.out.println("잘못 입력");
//			break;
//			}
		}
	}