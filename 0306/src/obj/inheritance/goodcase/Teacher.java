             package obj.inheritance.goodcase;

import obj.inheritance.person;

public class Teacher extends person {
	
	public String teacherId;
	public String subject;
	public Teacher() {
		
	}
	
	
	@Override
	public String getDetails() {
		// TODO Auto-generated method stub           
		return "[이름: "+name+"\t나이: "+age+"\t교번: "+teacherId+"\t과목: "
				+subject+"]";
	}


	public Teacher(String name, int age, String subject) {
		super(name,age);
		this.subject = subject;
	}

}