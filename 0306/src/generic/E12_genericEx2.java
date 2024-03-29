package generic;

import java.util.ArrayList;

public class E12_genericEx2 {
	public static void main(String[] args) {
		Wallet<Card, Money> card_wallet = new Wallet<>("파란색");
		Wallet<CreditCard, Money> card_wallet2 = new Wallet<>("검은색");
//		Wallet<String, Integer> card_wallet3 = new Wallet<>("빨간색"); 타입 제한때문에 불가
		card_wallet.pouch.add(new CreditCard());
		card_wallet.pouch.add(new CheckCard());
		card_wallet.pouch.add(new BusCard());
//		card_wallet2.pouch.add(new CheckCard());
		card_wallet2.pouch.add(new CreditCard());
		
		card_wallet2.pouch2.add(new Dollar());
		card_wallet2.pouch2.add(new Won());
		//
		ArrayList<Integer> int_list = new ArrayList<>();
		ArrayList<String> str_list = new ArrayList<>();
		ArrayList<Object> obj_list = new ArrayList<>();
		
		str_list.add("제네릭 때문에 문자열만 들어간다");
		str_list.add("문자를 제네릭 컬렉션으로 지정했기 때문");
		int_list.add(100);
		int_list.add(new Integer(20));
		obj_list.add(new Person<String>("홍길동",11));
		
		usingArrayListMethod(obj_list);
		usingArrayListMethod(str_list);
		usingArrayListMethod(int_list);

		usingArrayListMethod(card_wallet);
		usingArrayListMethod(card_wallet2);
	}
	// generic이 달라도 오버로딩은 할수 없음
//	static void usingArrayListMethod(ArrayList<Integer> list) {
//		System.out.println(list);
//	}
//	static void usingArrayListMethod2(ArrayList<String>list) {
//		System.out.println(list);
//}
	// <?> : 와일드카드 - 제너릭으로 오버로드를 구현하고 싶을 때 사용
	static void usingArrayListMethod(ArrayList<?>list) {
		System.out.println(list);
	}
	static void usingArrayListMethod(Wallet<? extends Card, ? extends Money> w) {
		System.out.println(w);
	}
}
// 제네릭에서 extends 는 타입 범위를 제한하는 역할을 하게 됨.
//- One extends Card : 첫번째 타입으로 Card를 상속받는 클래스만 허용
//- Two extends Money : 두번째 타입으로 Money를 상속받는 클래스만 허용
class Wallet<One extends Card, Two extends Money> {
	ArrayList<One> pouch;
	ArrayList<Two> pouch2;
	String color;
	//생성자
	public Wallet(String color) {
		this.pouch =new ArrayList<>();
		this.pouch2 = new ArrayList<>();
		this.color = color;
	}
	public One get(int index) {
		return pouch.get(index);
	}
	@Override
	public String toString() {
		return "지갑의 내용물을 출력합니다.";
	}
	
}
class Card {}
class CreditCard extends Card {}
class CheckCard extends Card {}
class BusCard extends Card {}

class Money {}
class Won extends Money{}
class Dollar extends Money{}


