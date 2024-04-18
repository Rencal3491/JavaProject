package javaEx_i;

public class PersonsVo {
	
	private int id;
	private int age;
	private String firstname;
	private String lastname;
	private String city;
	public PersonsVo() {}
	public PersonsVo(int id, int age, String firstname, String lastname, String city) {
		this.id = id;
		this.age = age;
		this.firstname = firstname;
		this.lastname = lastname;
		this.city = city;	
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[id : "+id+", lastname : "+lastname+",firstname: "+firstname+",age " +age+", city: " +city+ "]";
	}

}
