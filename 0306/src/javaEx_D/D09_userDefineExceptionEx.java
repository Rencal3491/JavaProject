package javaEx_D;

class Member {
	String name;
	String phone;
	String address;
	public Member(String name, String phone, String address) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
	
}

public class D09_userDefineExceptionEx {

	public static void main(String[] args) {
		D09_userDefineExceptionEx memberManeger = new D09_userDefineExceptionEx();
		try {
			memberManeger.insert(new Member("ㅈㅁㅈ", "010-0000-0000", "서울시 마포구"));
		} catch (DuplicateKeyException e) {
			// TODO: handle exception
		}

	}
	public void insert(Member member) throws DuplicateKeyException {
		System.out.println("고객 정보를 저장합니다");
		System.out.println(member.name + "님의 정보");
		//db에 ㅈㅁㅈ 01000000000 정보가 있다고 간주
		if ("ㅈㅁㅈ".equals(member.name) && "010-0000-0000".equals(member.phone)) {
			//이 경우에 db는 중복된 상태
			//이때 예외를 발생시켜 인서트 메소드를 호출한 곳으로 데이터가 중복됨을 알림
			throw new DuplicateKeyException("데이터가 중복됨");
		} else {
			System.out.println("db에 저장되었습니다.");
		}
	}
}
@SuppressWarnings("serial")
//사용자 정의 예외메소드
class DuplicateKeyException extends Exception {
	
	public DuplicateKeyException(String message) {
		super(message);
	}
}