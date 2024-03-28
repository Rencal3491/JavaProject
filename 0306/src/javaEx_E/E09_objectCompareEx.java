package javaEx_E;
import java.util.TreeSet;

import obj.Dog;

public class E09_objectCompareEx {

	public static void main(String[] args) {
		//비교 객체 확인
		Dog d1 = new Dog("진돗개", "뽀삐", 15);
		Dog d2 = new Dog("말티즈", "삐삐",	5);
		Dog d3 = new Dog("진돗개", "뽀삐", 15);
		//Dog d3와 d1 비교
		System.out.println(d1==d3);
		System.out.println(d1.equals(d3));
		System.out.println(d1);
		System.out.println(d3);
		System.out.println("==========================");
		//객체간 크기 비교
		TreeSet<Dog> tset = new TreeSet<>();
		System.out.println(tset.add(d1));
		System.out.println(tset.add(d2));
		for(Dog dog : tset) {
			System.out.println(dog);
		}
		TreeSet<Dog> tset2 = new TreeSet<Dog>(new DogComparator());
		System.out.println(tset2.add(d1));
		System.out.println(tset2.add(d2));
		for(Dog dog : tset2) {
			System.out.println(dog);
		}
	}
}
