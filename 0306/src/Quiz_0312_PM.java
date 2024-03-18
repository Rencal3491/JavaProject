import java.util.Scanner;

public class Quiz_0312_PM {

	public static void main(String[] args) {
		/* 1. 소수 구하기
		조건문과 반복문을 사용하여 100이하의 소수 출력
		
		* 2. 단어 거꾸로 출력
		*  스캐너 이용하여 입력받은 문자열을 for문을 사용하여 거꾸로 출력
		*  (String.charAt(index)사용)
		* 3. 로또 번호 추첨
		* 난수를 생성하여 중복없이 1~45까지 6개를 추출하여 콘솔에 출력
		*  while for
		* 4. 대문자가 입력되면 소문자로 출력하고
		*  소문자가 입력되면 대문자로 출력
		* 5. 커피의 가격은 2천원 10개 이상 구매시 초과분은 1500원 받는다
		* 	커피의 개수를 입력받고 총 가격 계산하여 출력
		* 6. 랜덤으로 알파벳 대문자 50개 출력
		* 	10개마다 줄바꿈
		*/
		//1
		int num,count;
		for(num=2 ; num<=100 ; num++){
			count=0;
			for(int i=2 ; i<num; i++)
				if(num%i==0) // 1과 정수 사이의 숫자 중 하나라도 나눈나머지가 0일때는 소수가 아니다
					count++;
			if(count==0) // count가 올라갔다면 소수가 아니다
				System.out.print(num+ " ");
		} 
		//2
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
        char[] strArray = new char[str.length()];
        System.out.println(str);
        for (int i = 0; i < str.length(); i++) {
            strArray[i] = str.charAt(str.length() - 1 - i);
        }
        str = new String(strArray);
        System.out.println(str);
        
        //3
    	int lotto[] = new int[6];	// 로또 번호를 입력받을 배열을 선언해준다.
    	
    	for(int i = 0; i < lotto.length; i++) {
    		int num1 = (int)(Math.random() * 45) + 1;	// 1~46까지의 임의의 수를 받는다.
    		lotto[i] = num1;
    		for(int j = 0; j < i; j++) {	// 중복된 번호가 있으면 이전 포문으로 돌아가 다시 시행한다.
    			if(lotto[i] == lotto[j]) {
    				i--;
    				break;
    			}
    		}
    		System.out.print(lotto[i] + " ");	// 로또번호를 출력한다.
    	}
    	System.out.println("\n");
    	
    	//4
		String input = "";	//입력받은 문자열을 저장할 input 선언
		String output = "";	//최종적으로 출력할 문자열을 저장하는 output 선언
		int tmp;
		
		Scanner scanner = new Scanner(System.in);		
		System.out.print("문자열을 입력하세요 : ");
		input = scanner.nextLine();	
		
		for(int i = 0 ; i < input.length() ; i++) {	
			tmp = (int)input.charAt(i);
			
			if( (65 <= tmp) && (tmp <= 90) ) {			//만약 입력한 값이 ascii코드 영 소문자 이상이고, 90보다 작으면
				output += (char)(tmp + 32);				//출력할 char값에 32씩 더한다 - 대문자 변환 
			}else if( (97 <= tmp) && (tmp <= 122)) { 	//만약 입력한 값이 ascii코드 영 대문자 이상이고, 122보다 작으면		
				output += (char)(tmp - 32);             //출력할 char값에 32씩 뺀다 - 소문자 변환 
			}else {
				output += (char)tmp;						
			}
		}		
		System.out.println("변환된 문자열 : " + output);

		
		//5 커피 
		System.out.println("커피 값 계산");
		System.out.println("몇 잔을 주문하시나요 >>");
		int qty = sc.nextInt();
		int price = 0;
		int nomal_price = 2000;
		int discount_price = 1500;
		
		if (qty>10) {
			price+=(10*nomal_price) + (qty-10) * discount_price;
			
		}else {
			price += qty *nomal_price;
		}
		System.out.println("주문하신 커피 잔 수는 : " + qty);
		System.out.println("총 가격은 :" + price);
		
		//6번 알파벳 랜덤생성
		int symbol_size = 'Z' - 'A' + 1; //26
		for (int i=0; i<50; i++) {
			char ch6 = (char)(Math.random() * symbol_size + 'A');
			System.out.print(ch6);
			if(i%10 == 9) {
				System.out.println();
			}
		}

		
		
	}

	
}

