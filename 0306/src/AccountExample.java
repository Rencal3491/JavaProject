
public class AccountExample {

	public static void main(String[] args) {
		//클래스를 테스트하는 메인 메소드
		Account acc1 = new Account("조민준", "010-0000-0000", "3333073744", 100000);
		System.out.println("잔액 확인 : > " + acc1.getBalance());
		//입금 10만원
		acc1.saveMoney(10000);
		System.err.println("10000원 입금 후 잔액 : "+ acc1.getBalance());
		acc1.saveMoney(60000);
		System.err.println("60000원 입금 후 잔액 : "+ acc1.getBalance());
		
	}
}
class Account {
	/*
	 * Account
		속성(명사적 특성) : 이름, 계좌번호, 패스워드,예금,이자
		기능(동사적 특성) : 입금,출금,예금확인
		생성자 : 이름, 계좌번호,패스워드,예금

	 */
	public String name;
	public String accountNumber;
	public String accountPw;			//비밀번호
	public long balance;			//잔금
	public float interest;			//이자
	
	public Account() {
		super();
	}
	public Account(String name, String accountNumber, String accountPw) {
		super();
		this.name = name;
		this.accountNumber = accountNumber;
		this.accountPw = accountPw;
	}
	public Account(String name, String accountNumber, String accountPw, long balance) {
		super();
		this.name = name;
		this.accountNumber = accountNumber;
		this.accountPw = accountPw;
		this.balance = balance;
	}
	//메소드 - 예금 출금 잔액확인
	//예금
	public void saveMoney(long amount) {
		balance = balance + amount; //
	}
	//출금
	public void withdrawMoney(long amount) {
		balance = balance - amount; //
	}
	//잔액 확인
	public long getBalance() {
		return balance;
		
	}
	
	
	
	
	

}
