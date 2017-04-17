package com.uws.domain.common;

public class StudentCourseScore{

	/***
	 * 学号
	 */
	private String studentId;
	
	/***
	 * 学年(编码)
	 */
	private String yearCode;
	
	/***
	 * 学期(编码：0，第一学期；1第二学期)
	 */
	private String termCode;
	
	/***
	 * 课程号
	 */
	private String courseCode;
	
	/***
	 * 课程名称
	 */
	private String courseName;
	
	/***
	 * 课程分数
	 */
	private String score;
	

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getYearCode() {
		return yearCode;
	}

	public void setYearCode(String yearCode) {
		this.yearCode = yearCode;
	}

	public String getTermCode() {
		return termCode;
	}

	public void setTermCode(String termCode) {
		this.termCode = termCode;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}
}
