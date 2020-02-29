package dto;

public class UserDTO {
	private int userId;
	private String firstName;
	private String LastName;
	private int salary;
	private String contactNo;
	private int deptId;
	private String address;
	public UserDTO()
	{
		
	}
	public UserDTO(int userId, String firstName, String lastName, int salary, String contactNo, int deptId,
			String address) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		LastName = lastName;
		this.salary = salary;
		this.contactNo = contactNo;
		this.deptId = deptId;
		this.address = address;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
