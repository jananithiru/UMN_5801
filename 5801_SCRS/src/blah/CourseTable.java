package blah;

import java.sql.Date;

public class CourseTable {
	int courseId;
	String name;
	int credits;
	Date firstDay;
	Date lastDay;
	String classBeginTime; //9:00am
	String classEndTime; // 11:00am
	String routines; //e.g. Fri
	String location;
	String type; //on campus or Unite
	String prereuisite;
	String description;
	String department;
	
	public CourseTable(int courseId, String name, int credits, Date firstDay, Date lastDay, String classBeginTime, String classEndTime,
			String routines, String location, String type, String prereuisite, String description, String department){
		super();
		this.courseId = courseId;
		this.name = name;
		this.credits = credits;
		this.firstDay = firstDay;
		this.lastDay = lastDay;
		this.classBeginTime = classBeginTime;
		this.classEndTime = classEndTime;
		this.routines = routines;
		this.location = location;
		this.type = type;
		this.prereuisite = prereuisite;
		this.description = description;
		this.department = department;
		
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public Date getFirstDay() {
		return firstDay;
	}

	public void setFirstDay(Date firstDay) {
		this.firstDay = firstDay;
	}

	public Date getLastDay() {
		return lastDay;
	}

	public void setLastDay(Date lastDay) {
		this.lastDay = lastDay;
	}

	public String getClassBeginTime() {
		return classBeginTime;
	}

	public void setClassBeginTime(String classBeginTime) {
		this.classBeginTime = classBeginTime;
	}

	public String getClassEndTime() {
		return classEndTime;
	}

	public void setClassEndTime(String classEndTime) {
		this.classEndTime = classEndTime;
	}

	public String getRoutines() {
		return routines;
	}

	public void setRoutines(String routines) {
		this.routines = routines;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPrereuisite() {
		return prereuisite;
	}

	public void setPrereuisite(String prereuisite) {
		this.prereuisite = prereuisite;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	
}
