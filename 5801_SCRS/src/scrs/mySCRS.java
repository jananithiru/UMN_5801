package scrs;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import scrs.ShibbolethAuth.Token; // NOTE: we need to import this 

public interface mySCRS {
	DBCoordinator dbCoordinator = new DBCoordinator();
	Token token = null;

	public Token userLogin(String x500, String password);

	public List<ArrayList<String>> queryStudentPersonalData(ShibbolethAuth.Token token, int studentID);

	public List<ArrayList<String>> queryAdminPersonalData(ShibbolethAuth.Token token, int adminID);


	public boolean studentAddClass(ShibbolethAuth.Token token, int courseID, String grading, String courseTerm);
	public boolean studentDropClass(ShibbolethAuth.Token token, int courseID);
	public boolean studentEditClass(ShibbolethAuth.Token token, int courseID, String grading, String courseTerm);
	


	// admin method
	boolean adminAddClass(ShibbolethAuth.Token token, int courseID, String courseName, int courseCredits,
			String instructor, String firstDay, String lastDay, String classBeginTime, String classEndTime,
			String weekDays, String location, String type, String prerequisite, String description, String department);

	boolean adminDeleteClass(ShibbolethAuth.Token token, int courseID);

	boolean adminEditClass(ShibbolethAuth.Token token, int courseID, String courseName, int courseCredits,
			String instructor, String firstDay, String lastDay, String classBeginTime, String classEndTime,
			String weekDays, String location, String type, String prerequisite, String description, String department);

	boolean adminAddStudentToClass(ShibbolethAuth.Token token, int studentID, int courseID, String grading,
			String courseTerm);

	boolean adminEditStudentRegisteredClass(ShibbolethAuth.Token token, int studentID, int courseID, String grading,
			String courseTerm);


}
