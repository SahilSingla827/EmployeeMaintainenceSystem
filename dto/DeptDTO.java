package dto;

public class DeptDTO {
	private int deptId;
	private String deptNane;
public DeptDTO(int deptId, String deptNane) {
	super();
	this.deptId = deptId;
	this.deptNane = deptNane;
}
public int getDeptId() {
	return deptId;
}
public void setDeptId(int deptId) {
	this.deptId = deptId;
}
public String getDeptNane() {
	return deptNane;
}
public void setDeptNane(String deptNane) {
	this.deptNane = deptNane;
}
}
