package dto;

public class GradeDTO {
	private int gradeId;
	private int minSal;
	private int maxSal;
public GradeDTO(int gradeId, int minSal, int maxSal) {
	super();
	this.gradeId = gradeId;
	this.minSal = minSal;
	this.maxSal = maxSal;
}
public int getGradeId() {
	return gradeId;
}
public void setGradeId(int gradeId) {
	this.gradeId = gradeId;
}
public int getMinSal() {
	return minSal;
}
public void setMinSal(int minSal) {
	this.minSal = minSal;
}
public int getMaxSal() {
	return maxSal;
}
public void setMaxSal(int maxSal) {
	this.maxSal = maxSal;
}
}
