package obj;
import java.util.*;
public class Account {
	public String name;
	public String bankNum;
	public int money;
	public int password;
	public int yeeja;
	
	Scanner sc = new Scanner(System.in);
	
	public void insertMoney() {
		int input = sc.nextInt();
		System.out.println("입금액을 입력하세요 >>");
		money += input;
		System.out.println("입금액은"+ input + "입니다");
		System.out.println("현재 잔액은"+ money + "입니다");
	}
	public void exitMoney() {
		int output = sc.nextInt();
		System.out.println("입금액을 입력하세요 >>");
		money -= output;
		System.out.println("출금액은"+ output + "입니다");
		System.out.println("현재 잔액은"+ money + "입니다");
	}
	public void checkMoney() {
		System.out.println("현재 잔액은"+ money + "입니다");
	}
	public Account(String name,String bankNum,int money, int password, int yeeja ) {
		this.name = name;
		this.bankNum = bankNum;
		this.money = money;
		this.password = password;
		this.yeeja = yeeja;
	}
	
}
