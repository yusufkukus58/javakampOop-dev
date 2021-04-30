package javakampodev2;

public class User {
	private String firstName;
	private String lastName;
	private int id;
	private String email;
	private String birthDate;
	
	
	public User() {
		
		
	}
	
	
	public User(String firstName, String lastName, int id, String email, String birthDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.email = email;
		this.birthDate = birthDate;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	
	
	
	

}
