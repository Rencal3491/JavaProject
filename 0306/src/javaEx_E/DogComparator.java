package javaEx_E;
import java.util.Comparator;

import obj.Dog;

public class DogComparator implements Comparator<Dog> {

	@Override
	public int compare(Dog o1, Dog o2) {
		// TODO Auto-generated method stub
		return o1.getWeight()-o2.getWeight();
		
	}

}
