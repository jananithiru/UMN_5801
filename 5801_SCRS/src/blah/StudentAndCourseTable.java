package blah;

public class StudentAndCourseTable {
	int id; // primary key
	int courseId;
	String grading; // A/F or S/N
	int studentId;

	public StudentAndCourseTable(int id, int courseId, String grading, int studentId) {
		super();
		this.id = id;
		this.courseId = courseId;
		this.grading = grading;
		this.studentId = studentId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getGrading() {
		return grading;
	}

	public void setGrading(String grading) {
		this.grading = grading;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

}
