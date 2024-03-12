import java.util.Scanner;

public class C00CustumerManeger {
	//고객 정보를 저장할 수 있는 배열 지정
	static final int MAX = 100; //final로 선언된 변수는 변경되지 않음
	//고객정보를 저장할 변수를 배열로 선언 : 이름, 성별, 이메일, 출생년도
	static String[] nameList = new String[MAX];		//이름 지정
	static String[] genderList = new String[MAX];	//성별 지정
	static String[] emailList = new String[MAX];	//이메일 지정
	static int[] birthList = new int[MAX];			//출생년도 지정
	
	// 배열을 참조하기 위해 인덱스 생성
	static int index = -1;		//배열의 인덱스 시작은 0부터 이기 때문에 -1이 되어야 함

	// 배열의 처음 선언한 크기보다 같거나 작은 개수의 자료를 저장
	// 현재 데이터가 몇개 저장되어 있는지 알 수 있는 변수가 필요함
	static int count = 0; 		//저장 할 갯수
	
	// 기본 입력장치로부터 데이터를 입력받기 위해 스캐너 객체 생성
	static Scanner sc = new Scanner(System.in); //스캐너
	
	
	
	
	public static void main(String[] args) {
		//고객 관리 프로그램 메뉴
		while (true) {
		//고객 메뉴 ui
			System.out.printf("\n[INFO] 고객 수 : %d, 인덱스 %d\n", count, index);
			System.out.println("메뉴를 입력하세요");
			System.out.println("(I)nsert, (P)revious,(N)ext, (C)urrent, (U)pdate, (D)elete, (Q)uit");
			String menu = sc.next();   		
			menu = menu.toLowerCase(); //대소문자 구분 없애기
			//메뉴 선택시 동작 구현
			switch (menu.charAt(0)) {
					
			case 'i': 
			case 'ㅑ': 
				System.out.println("고객 정보 입력을 시작합니다.. ");
				if (count >= MAX) {
					System.out.println("더 이상 저장할 수 없습니다.. ");
				} else {
					//저장을 위한 메소드
					insertCustomerData();
					System.out.println("고객 정보를 저장했습니다..");
				}
				break;
			
			case 'p': //previous
			case 'ㅔ': 
				System.out.println("이전 데이터를 출력합니다..");
				if(index <= 0) { //이전 데이터가 존재하지 않는 경우
					System.out.println("이전 데이터가 존재하지 않습니다..");
				} else {
					index--;
					printCustormer(index);
				}
				break;
			
			case 'n':
			case 'ㅜ': 
				System.out.println("다음 데이터를 출력합니다..");
				if(index >= count -1) {
					System.out.println("다음 데이터가 존재하지 않습니다");
				}else {
					index++;
					printCustormer(index);
				}
				break;		
			case 'c':
			case 'ㅊ': {
				System.out.println("현재 데이터를 출력합니다");
				if((index >= 0) && ( index < count )) {
					printCustormer(index);
					
				}else {
					System.out.println("다음 데이터가 존재하지 않습니다");
				}
			}
				break;	
			case 'u': 	
			case 'ㅕ': 
				break;
				
			case 'd': 
			case 'ㅇ': 
				break;
		
			case 'q': // 종료
			case 'ㅂ': 
				System.out.println("프로그램을 종료합니다..");
				sc.close();
				System.exit(0);
				break;
			default : 
				System.out.println("잘못된 입력");
			
		}
	}

}

	public static void insertCustomerData() {
		//이름, 성별, 이메일, 출생년도 배열에 저장
		System.out.print("이름 : ");
		String name = sc.next();		
		System.out.print("성별 : ");
		String gender = sc.next();
		System.out.print("이메일 : ");
		String email = sc.next();
		System.out.print("출생년도 : ");
		int birthYear = sc.nextInt();
		
		//고객 객체를 배열에 저장
		nameList[count] = name;
		genderList[count] = gender;
		emailList[count] = email;
		birthList[count] = birthYear;
		count++; //count 번째 배열에 객체 저장 후에 count값 증가
	}
	public static void printCustormer(int index) {
		System.out.println("==============Customer INFO==============");
		System.out.println("이름 : " + nameList[index]);
		System.out.println("성별 : " + genderList[index]);
		System.out.println("이메일 : " + emailList[index]);
		System.out.println("출생년도 : " + birthList[index]);
		System.out.println("=========================================");
		
	}
	public static void updateCustomerData(int index) {
		System.out.println("-----------UPDATE CUSTOMER INFO-----------");
		System.out.println("이름"+"("+nameList[index]+") ");
		String name = sc.nextLine();
		if(name.length()!=0) { //검증
			nameList[index] = name;
		}
		System.out.println("성별 (" + genderList[index]+ "):");
		genderList[index] = sc.next();
		System.out.println("이메일 (" + emailList[index]+ "):");
		emailList[index] = sc.next();
		System.out.println("출생년도 (" + birthList[index]+ "):");
		birthList[index] = sc.nextInt();
		}
	public static void deleteCustomerData(int index) {
		for(int i=index; i<count -1; i++) {
			nameList[index] = nameList[i+1];
			genderList[index] = genderList[i+1];
			emailList[index] = emailList[i+1];
			birthList[index] = birthList[i+1];
		}
		count --;
	}
}
