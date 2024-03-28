package javaEx_E;
import java.util.Set;
import java.util.HashSet;
public class E01_setEx {

	public static void main(String[] args) {
		Set set = new HashSet();
		
		// add() - 추가
		set.add("three");
		set.add("one");
		set.add("two");
		set.add("four");
		set.add("five");
		set.add(new Integer(4));
		boolean isAdded = set.add("five"); // add() boolean타입으로 t/f 
		System.out.println(set);
		System.out.println(isAdded);
		
		// size()
		System.out.println("set의 사이즈 : " + set.size());
		// remove() - 삭제,제거 
		set.remove("two");
		System.out.println("two 제거 결과 : " + set);
		//clear() - 모두 제거
		set.clear();
		System.out.println(set);
		//isEmpty() - 비어있는지 체크
		if (set.isEmpty()) {
			System.out.println("set is Empty");
		}
		
		
		
		
		
	}

}
