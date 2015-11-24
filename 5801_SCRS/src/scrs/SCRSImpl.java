package scrs;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import scrs.ShibbolethAuth.Token;
import java.util.Date;

public class SCRSImpl implements mySCRS {
	
	@Override
	public List<ArrayList<String>> queryStudentPersonalData(Token token, int studentID) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
//	
//	//	Date date= new Date();
//	//	Timestamp curTimeStamp = new Timestamp(date.getTime());
//	//	
//	//	ShibbolethAuth.Token token = 
//	//			new ShibbolethAuth.Token(1, ShibbolethAuth.Token.RoleType.STUDENT, curTimeStamp.toString()); 
//
//	@Override
//	public List<ArrayList<String>> queryClass(int courseID, String courseName, String location, String term,
//			String department, String classType, String instructorName) {
//		// TODO Auto-generated method stub
//		
//		return null;
//	}
//
//	@Override
//	public List<ArrayList<String>> queryStudentPersonalData(ShibbolethAuth.Token token, int studentID) {
//		
//		return null;
//	}
//
//	@Override
//	public List<ArrayList<String>> queryStudentRegistrationHistory(Token token, int studentID) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<ArrayList<String>> queryAdminPersonalData(Token token) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<ArrayList<String>> queryInstructor(Token token, int instructorID) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public boolean studentAddClass(Token token, int courseID, String grading, String courseTerm) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean studentDropClass(Token token, int courseID) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean studentEditClass(Token token, int courseID, String grading, String courseTerm) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean adminAddClass(Token token, int courseID, String courseName, int courseCredits, String instructor,
//			String firstDay, String lastDay, String classBeginTime, String classEndTime, String weekDays,
//			String location, String type, String prerequisite, String description, String department) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean adminDeleteClass(Token token, int courseID) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean adminEditClass(Token token, int courseID, String courseName, int courseCredits, String instructor,
//			String firstDay, String lastDay, String classBeginTime, String classEndTime, String weekDays,
//			String location, String type, String prerequisite, String description, String department) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean adminAddStudentToClass(Token token, int studentID, int courseID, String grading, String courseTerm) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean adminEditStudentRegisteredClass(Token token, int studentID, int courseID, String grading,
//			String courseTerm) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
	
}
