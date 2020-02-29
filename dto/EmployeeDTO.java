package dto;

public class EmployeeDTO extends UserDTO{
	private int managerId;
	private LeaveDTO leave;
	
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	public LeaveDTO getLeave() {
		return leave;
	}
	public void setLeave(LeaveDTO leave) {
		this.leave = leave;
	}
	public EmployeeDTO(int managerId, LeaveDTO leave,int userId, String firstName, String lastName, int salary, String contactNo, int deptId,
			String address) {
		super(userId,firstName,lastName,salary,contactNo,deptId,address);
		this.managerId = managerId;
		this.leave = leave;
	}
	public EmployeeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
