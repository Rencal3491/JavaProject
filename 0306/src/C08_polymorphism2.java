import obj.inheritance.person;
import obj.inheritance.goodcase.Employee;
import obj.inheritance.goodcase.Student;
import obj.inheritance.goodcase.Teacher;

public class C08_polymorphism2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("홍학생",17,"20242035","java");
		printPersonInfo(s);
		Teacher t = new Teacher("홍선생",27,"java education");
		printPersonInfo(t);
		Employee e = new Employee("홍사원",37,"java programming");
		printPersonInfo(e);

	}
//다형적 인자별로 출력하는 메소드
	public static void printPersonInfo(person p) {
		if(p instanceof Student) {
			System.out.println("*******Student info*******");
		}else if (p instanceof Teacher) {
			System.out.println("*******Teacher info*******");
		}else if (p instanceof Employee) {
			System.out.println("*******Employee info*******");
		}else {
			System.out.println("*******person info*******");
		}
		System.out.println(p);
		System.out.println(p.getDetails());
		System.out.println("**********************************");
	}
}
