package scrs;

import java.util.ArrayList;

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
}
