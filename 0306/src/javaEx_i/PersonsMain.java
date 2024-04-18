package javaEx_i;

import java.util.List;
import java.util.Scanner;

public class PersonsMain {

	public static void main(String[] args) {
		PersonsDAO dao = new PersonsDAO();
		PersonsVo vo = new PersonsVo();
		Scanner sc = new Scanner(System.in);
		//데이터 추가
//		System.out.println("Persons 에 데이터 추가");
//		System.out.println("(성) 입력:");
//		vo.setFirstname(sc.next());
//		System.out.println("(이름) 입력:");
//		vo.setLastname(sc.next());
//		System.out.println("(나이) 입력:");
//		vo.setAge(sc.nextInt());
//		System.out.println("(도시) 입력:");
//		vo.setCity(sc.next());
		//레코드 추가 메소드
//		int res = dao.insert(vo);		
//		if(res!=0) {
//			System.out.println("레코드 추가 성공");
//		} else {
//			System.out.println("레코드 추가 실패");
//		}
		//전체 출력확인
//		List<PersonsVO> list =  dao.allPersons();
//		for(PersonsVO pvo : list) {
//			System.out.println(pvo);
//		}
//		System.out.println("특정 id를 가진 persons 출력");
//		System.out.println("id를 입력해주세요");
		int ids = sc.nextInt();
		PersonsVo sVo = dao.selectOne(ids);
		System.out.println(sVo);
		System.out.println("<수정하기>");
		System.out.println("특정 id값 정보 불러오기");
		int id2 = sc.nextInt();
		PersonsVo uVo = dao.selectOne(id2);
		System.out.println("수정할 성을 입력하세요 ("+uVo.getLastname()+")");
		String lastname = sc.next();
		
		if(!lastname.equals("")) {
			uVo.setLastname(lastname);
		}
		System.out.println("수정할 이름을 입력하세요 ("+uVo.getFirstname()+")");
		String firstname = sc.next();
		
		if(!firstname.equals("")) {
			uVo.setFirstname(firstname);
		}
		System.out.println("수정할 나이를 입력하세요 ("+uVo.getAge()+")");
		
		int age = sc.nextInt();
		
		if((age !=0 && age>=0)) {
			uVo.setAge(age);
		}
		System.out.println("수정할 도시를 입력하세요 ("+uVo.getCity()+")");
		String city = sc.next();
		
		if(!city.equals("")) {
			uVo.setCity(city);
		}
		int res = dao.updatePersons(uVo);
		if(res!=0) {
			System.out.println("수정 성공");
		} else {
			System.out.println("수정 실패");
		}
		
		sc.close();
	}

}
