package obj.inheritance.badcase;

public class Student {
	//이름 나이 학번 전공
		String name;
		int age;
		String stuId;
		String subject;

		
		public String getDetails() {
			return "[이름 :"+ name + "\t + " + "나이"+ age + "\t + " + "키" + stuId + "\t" + "몸무게" + subject + "]";
		}
	}


