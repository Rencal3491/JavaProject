/*
 * 	캡슐화(은닉)
 * 	접근 제한자를 이용하여 접근 제한하는 경우
 *  - 외부에서 변수에 직접접근 x
 *  - 직접 접근 불가하므로 메소드를 통해 변수의 변경 및 참조
 *  
 *  왜 이런 방식을 사용하는가
 *  - 잘못된 값(데이터)이 변수의 값이 되는 것을 방지하기 위해서
 *  - 접근 권한이 없는 사용자에 의한 데이터 접근을 방지하기 위해서
 *  
 *  어떻게 사용하는가 
 *  변수 앞에 private
 *  메소드 선언 앞에는 public (getter / setter)
 *  
 * 	변수 뿐만 아니라 클래스 안에서만 사용하는 메소드들에 대해서도 private 설정 가능하고
 *  이를 외부에서 사용할 때도 동일한 방식을 사용할 수 있다
 */
public class C05_encapsulation {
	public static void main(String[] args) {
		//badcase
		MyDate_badCase myBirth = new MyDate_badCase();
		myBirth.day = 32;
		System.out.println("내 생일은 " + myBirth.day);
		//goodcase
		MyDate_goodCase mybirthDate_goodCase = new MyDate_goodCase();
//		mybirthDate_goodCase.day = 32; //접근 제한자가 private
		mybirthDate_goodCase.setDay(32);
		System.out.println(mybirthDate_goodCase.getDay());
 	}
}
// bad case			//검증x

class MyDate_badCase{
	public int day;
	public int month;
	public int year;
	
}
//good case
class MyDate_goodCase {
	private int day;
	private int month;
	private int year;
	
	//getter
	public int getDay() {
		return day;
		
	}
	//setter
	public void setDay(int day) {
		if((day < 1) || (day > 31)) {
			System.out.println("잘못된 날짜 입력");
			this.day = 1;	
		} else {
			this.day = day;
		}
	}
	
	
	
}











