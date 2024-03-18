import obj.inheritance.person;
import obj.inheritance.goodcase.Employee;
import obj.inheritance.goodcase.Student;
import obj.inheritance.goodcase.Teacher;

public class C09_HeteroCollection {

	public static void main(String[] args) {
		person[] pArr =new person[4];

		
		pArr[0] = new person("홍씨",20);
		pArr[1] = new Student("홍학생", 17,"2020303","도술");
		pArr[2] = new Teacher("홍선생",22,"자바 프로그래밍");
		pArr[3] = new Employee("홍사원",26,"교무처");
		for (int i=0; i<pArr.length; i++) {
			System.out.println(pArr[i].getDetails());
		}
		for (person p : pArr) {				//향상된 for문
			System.out.println(p.getDetails());
		}
	}

}
