package scrs;

import java.sql.SQLException;
import java.util.ArrayList;

import scrs.Constants.PrimitiveDataType;
import scrs.ShibbolethAuth.Token;

public class Admin extends Person {

	public boolean adminAddClass(ShibbolethAuth.Token token, int courseID, String courseName, int courseCredits,
			String instructor, String firstDay, String lastDay, String classBeginTime, String classEndTime,
			String weekDays, String location, String type, String prerequisite, String description, String department)
					throws SQLException {
		if (token.type != Token.RoleType.ADMIN) {
			return false;
		}

		DBCoordinator dbcoordinator = new DBCoordinator();
		String sqlCmd = null;
		sqlCmd = "INSERT INTO COURSE TABLE VALUES ID " + courseID + courseName + courseCredits + firstDay + lastDay
				+ classBeginTime + classEndTime + weekDays + location + type + prerequisite + description + department
				+ ")";
		ArrayList<String> dataList = null;
		
		
		
		
		ArrayList<PrimitiveDataType> typeList = null;
		
		dbcoordinator.insertData(sqlCmd, dataList, typeList);

		return true;

	}

	public boolean adminDeleteClass(ShibbolethAuth.Token token, int courseID) throws SQLException {
		if (token.type != Token.RoleType.ADMIN) {
			return false;
		}

		DBCoordinator dbcoordinator = new DBCoordinator();
		String sqlCmd = null;
		sqlCmd = "DELETE DATA FROM COURSETABLE WHERE ID =" + courseID;
		ArrayList<String> dataList = null;
		ArrayList<PrimitiveDataType> typeList = null;
		dbcoordinator.deleteData(sqlCmd, dataList, typeList);

		return false;

	}

	public boolean adminEditClass(ShibbolethAuth.Token token, int courseID, String courseName, int courseCredits,
			String instructor, String firstDay, String lastDay, String classBeginTime, String classEndTime,
			String weekDays, String location, String type, String prerequisite, String description, String department)
					throws SQLException {

		if (token.type != Token.RoleType.ADMIN) {
			return false;
		}

		DBCoordinator dbcoordinator = new DBCoordinator();

		String sqlCmd = null;
		sqlCmd = "UPDATE COURSETABLE SET" + "ID =" + courseID + "NAME =" + courseName + "CREDITS = " + courseCredits
				+ "FIRSTDAY = " + firstDay + "LASTDAY = " + lastDay + "CLASSBEGINTIME = " + classBeginTime
				+ "CLASSENDTIME =" + classEndTime + "ROUTINES =" + weekDays + "LOCATION +" + location + "TYPE = " + type
				+ "PREREQUISITE =" + prerequisite + "DESCRIPTION =" + description + "DEPARTMENT = " + department;
		ArrayList<String> dataList = null;
		ArrayList<PrimitiveDataType> typeList = null;
		dbcoordinator.updateData(sqlCmd, dataList, typeList);

		return true;
	}

	public boolean adminAddStudentToClass(ShibbolethAuth.Token token, int studentID, int courseID, String grading,
			String courseTerm) throws SQLException {

		if (token.type != Token.RoleType.ADMIN) {
			return false;
		}

		DBCoordinator dbcoordinator = new DBCoordinator();

		String sqlCmd = null;

		sqlCmd = "INSERT INTO STUDENTANDCOURSE VALUES (" + studentID + courseID + grading + courseTerm + ")";
		ArrayList<String> dataList = null;
		ArrayList<PrimitiveDataType> typeList = null;

		dbcoordinator.insertData(sqlCmd, dataList, typeList);

		return true;

	}

	public boolean adminEditStudentRegisteredClass(ShibbolethAuth.Token token, int studentID, int courseID,
			String grading, String courseTerm) throws SQLException {
		if (token.type != Token.RoleType.ADMIN) {
			return false;
		}

		DBCoordinator dbcoordinator = new DBCoordinator();

		String sqlCmd = null;
		sqlCmd = "UPDATE STUDENTANDCOURSE SET ID =" + studentID + "SET COURSEID =" + courseID + "SET GRADING = "
				+ grading + "SET COURSETERM =" + courseTerm;
		ArrayList<String> dataList = null;
		ArrayList<PrimitiveDataType> typeList = null;

		dbcoordinator.updateData(sqlCmd, dataList, typeList);

		return true;

	}

}
