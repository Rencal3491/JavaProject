package javaEx_E;
import java.util.Comparator;
import java.util.TreeSet;

public class E10_compareEx2 {

	public static void main(String[] args) {
		//TreeSet , TreeMap은 이진 검색 트리를 구현한 컬렉션
		//- 순서가 있기 때문에 정렬이 가능함
		//- 정렬 방법은 Comparator, Comparable 인터페이스를 이용해서 지정
		//- Comparator는 클래스를 변경하지 않고 사용
		//- Comparable은 클래스에 값을 지정해서 사용
		//이진검색트리란
		//모든 노드는 최대 두개의 자식 노드를 가질 수 있다
		//왼쪽 자식 노드의 값은 부모보다 작다
		//오른쪽 자식 노드의 값은 부모보다 크다
		//노드의 추가삭제가 오래걸림
		//검색 정렬이 빠름
		TreeSet<GymMember> gym = new TreeSet<>();

		gym.add(new GymMember("박지성", 1000));
		gym.add(new GymMember("김연아", 1001));
		gym.add(new GymMember("싸이", 1002));
		gym.add(new GymMember("봉준호", 1003));
		gym.add(new GymMember("조현우", 1004));
		gym.add(new GymMember("BTS", 1005));
		gym.add(new GymMember("박찬호", 1006));
		gym.add(new GymMember("국뽕", 1007));
		System.out.println(gym);
		TreeSet<GymMember> gym2 = new TreeSet<>(new Comparator<GymMember>() {

			@Override
			public int compare(GymMember o1, GymMember o2) {
				//compare 메소드
				//o1과 o2의 자리를 바꾸고싶으면 
				//1 유지는 -1 같음을 나타내고싶으면 0 리턴
				if(o1.name.charAt(1)<o2.name.charAt(1)) {
					return -1;
				} else if (o1.name.charAt(0)>o2.name.charAt(0)) {
					return 1;
				}else {
					return 0; //set인 경우에 0이 리턴되면 중복으로 간주됨
				}
				
				
			}
			
		});
		System.out.println();
		gym2.add(new GymMember("박지성", 1000));
		gym2.add(new GymMember("김연아", 1001));
		gym2.add(new GymMember("싸이", 1002));
		gym2.add(new GymMember("봉준호", 1003));
		gym2.add(new GymMember("조현우", 1004));
		gym2.add(new GymMember("BTS", 1005));
		gym2.add(new GymMember("박찬호", 1006));
		gym2.add(new GymMember("국뽕", 1007));
		System.out.println(gym2);
	}

}
class GymMember implements Comparable<GymMember>{
	//멤버변수
	String name;
	double height;
	double weight;
	int age;
	int memNum;
	//생성자
	public GymMember(String name, int memNum) {
		this.name = name;
		this.memNum = memNum;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s [%d]", name, memNum);
	}

	@Override
	public int compareTo(GymMember o) {
		//compareTo 메소드는 매개변수 o를 통해서 비교 대상 전달받고 
		//-현재 인스턴스와 o의 자리를 바꾸고 싶은 경우에 1 리턴함 10-8=2(양수를 리턴한다)
		// 현재 인스턴스와 o의 자리를 그대로 유지하고 싶은 경우 -1 리턴함
		//-현재 인스턴스와 o가 같은 값임을 나타내고 싶다면 0 리턴
		int next = o.memNum;
		System.out.println(memNum + " vs " + next);
		if(memNum < next) {
			return -1;
		} else if (memNum > next) {
			return 1;
		} else {
			return 0;
		}
	}
	
}