package obj.inheritance.badcase;


public class Teacher {
	String name;
	
	int age;
	String teacherId;
	String subject;

	
	public String getDetails() {
		return "[이름 :"+ name + "\t + " + "나이"+ age + "\t + " + "id" + teacherId + "\t" + "과목" + subject + "]";
	}
}
