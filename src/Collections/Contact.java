package Collections;

public class Contact {
	
	String name;
	String email;
	Enum gender;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Enum getGender() {
		return gender;
	}
	
	enum gender{
		male,female;
	}
	public void setGender(Enum gender) {
		this.gender = gender;
	}
	public Contact(String name, String email, Enum gender) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "Contactlist [name=" + name + ", email=" + email + ", gender=" + gender + "]";
	}
	
	
	
	

}
