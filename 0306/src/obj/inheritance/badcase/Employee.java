package obj.inheritance.badcase;

public class Employee {
	String name;
	int age;
	String companyId;
	String department;

	
	public String getDetails() {
		return "[이름 :"+ name + "\t + " + "나이"+ age + "\t + " + "id" + companyId + "\t" + "r" + department + "]";
	}
}
