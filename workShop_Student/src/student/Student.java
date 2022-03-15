package student;

public class Student {
	
	private int id;
	private String firstName;
	private String lastName;
	private String idendityNo;
	
	public Student() {
		super();
	}
	
	public Student(int id, String firstName, String lastName, String idendityNo) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.idendityNo = idendityNo;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getIdendityNo() {
		return idendityNo;
	}
	public void setIdendityNo(String idendityNo) {
		this.idendityNo = idendityNo;
	} 


}
