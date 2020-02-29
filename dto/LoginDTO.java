package dto;

public class LoginDTO {
	private int userId;
	private String userName;
	private String password;
	private String type;
	public LoginDTO(int userId, String userName, String password, String type) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.type = type;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
