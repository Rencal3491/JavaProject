package obj.inheritance.goodcase;

import obj.inheritance.person;

public class Employee extends person {

	public String companyId;
	public String department;
	
	public Employee() {
		
	}
	public Employee(String name, int age, String department) {
		super(name,age);
		this.department = department;
	}
	
	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return "[이름: "+name+"\t나이: "+age+"\t사번: "+companyId+"\t부서: "
				+department+"]";
	}
	
}