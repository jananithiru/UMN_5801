package scrs;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import scrs.ShibbolethAuth.Token;
import java.util.Date;

public class SCRSImpl implements SCRS {
	
	public List<ArrayList<String>> queryStudentPersonalData(Token token, int studentID) {
		//TODO: Done. IN higher class if this session belongs to a student then query student personal data 
		// iff] student is present in the student tb]\\avle, 
		
		// TODO: Come up with this string escpared corrected 
		//String sqlStr = "select * '\''"
		DBCoordinator dbcoordinator = new DBCoordinator();
		
		List<ArrayList<Object>> objList = dbcoordinator.queryData(sqlStr);
		
		//TODO: Type case from Object to String 
		
		return null;
	}

	@Override
	public Token userLogin(String x500, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ArrayList<String>> queryAdminPersonalData(Token token, int adminID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ArrayList<String>> queryClass(int courseID, String courseName, String location, String term,
			String department, String classType, String instructorName) {
				
		// TODO: Come up with this string escpared corrected 
		DBCoordinator dbcoordinator = new DBCoordinator();
			
		//"select all class which match my criteria"
		
		//String sqlStr = "select * rom classe hwere course '\''"
		
		List<ArrayList<Object>> objList = dbcoordinator.queryData(sqlStr);
				
		//TODO: Type case from Object to String 
				
		
		
		
		
		
		return null;
	}

	@Override
	public List<ArrayList<String>> queryStudentRegistrationHistory(Token token, int studentID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ArrayList<String>> queryAdminPersonalData(Token token) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ArrayList<String>> queryInstructor(Token token, int instructorID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean studentAddClass(Token token, int courseID, String grading, String courseTerm) {
//		// TODO Auto-generated method stub
//
//		// TODO: Come up with this string escpared corrected 
//		DBCoordinator dbcoordinator = new DBCoordinator();
//			
//		//"select all class which match my criteria"
//		// query for class data 
//		//String sqlStr = "select * rom classe hwere course '\''"
//		
//		List<ArrayList<Object>> objList = dbcoordinator.queryData(sqlStr);
//
//		//calc time frame for those classes 
//		
//		calculateTimeFramefromFirstClass(objList[i])
//		
//		
//		if ( today is lesser than time frame)
//			then insert into data 
//			// insert sql
//				dbCooridnator.insert
//				
//				else retunr erro
		
		
		//TODO: Type case from Object to String 
				
		
		
		
		
		return false;
	}

	@Override
	public boolean studentDropClass(Token token, int courseID) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean studentEditClass(Token token, int courseID, String grading, String courseTerm) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean adminAddClass(Token token, int courseID, String courseName, int courseCredits, String instructor,
			String firstDay, String lastDay, String classBeginTime, String classEndTime, String weekDays,
			String location, String type, String prerequisite, String description, String department) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean adminDeleteClass(Token token, int courseID) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean adminEditClass(Token token, int courseID, String courseName, int courseCredits, String instructor,
			String firstDay, String lastDay, String classBeginTime, String classEndTime, String weekDays,
			String location, String type, String prerequisite, String description, String department) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean adminAddStudentToClass(Token token, int studentID, int courseID, String grading, String courseTerm) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean adminEditStudentRegisteredClass(Token token, int studentID, int courseID, String grading,
			String courseTerm) {
		// TODO Auto-generated method stub
		return false;
	}	
}
