package dto;

import java.sql.Date;

public class LeaveDTO {
	private int leaveId;
	private Date startDate;
public LeaveDTO(int leaveId, Date startDate, Date endDate) {
	super();
	this.leaveId = leaveId;
	this.startDate = startDate;
	this.endDate = endDate;
}
public int getLeaveId() {
	return leaveId;
}
public void setLeaveId(int leaveId) {
	this.leaveId = leaveId;
}
public Date getStartDate() {
	return startDate;
}
public void setStartDate(Date startDate) {
	this.startDate = startDate;
}
public Date getEndDate() {
	return endDate;
}
public void setEndDate(Date endDate) {
	this.endDate = endDate;
}
Date endDate;

}
