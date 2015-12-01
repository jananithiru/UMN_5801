package scrs;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import scrs.ShibbolethAuth.Token;
import java.util.Date;
import java.util.Iterator;

public class SCRSImpl implements mySCRS {

	public List<ArrayList<String>> queryStudentPersonalData(Token token, int studentID) {
<<<<<<< HEAD
		// TODO: //Assuming the request is already verified as student.
		// Done. IN higher class if this session belongs to a student then query
		// student personal data
		// iff] student is present in the student tb]\\avle,

		// TODO: Create new DBCoodinator object here or elsewhere ?
		DBCoordinator dbcoordinator = new DBCoordinator();

		// TODO: Come up with this string escaped corrected
		String sqlStr = "select * from student where id=" + studentID;

		List<ArrayList<Object>> objList = dbcoordinator.queryData(sqlStr);

		List<ArrayList<String>> result = new ArrayList<ArrayList<String>>();

		// TODO: Type case from Object to String
		Iterator<ArrayList<Object>> outerIter = objList.iterator();
		while (outerIter.hasNext()) {
			ArrayList<String> metaRes = new ArrayList<String>();
			Iterator<Object> innerIter = outerIter.next().iterator();
			while (innerIter.hasNext()) {
				metaRes.add(innerIter.next().toString());
				// System.out.println(innerIter.next());
			}
			result.add(metaRes);
		}
=======

		if (token.type == Token.RoleType.UNDEFINED) {
			System.out.print(ErrorMessages.invalidCredentials);
			return null;
		} else if (token.type == Token.RoleType.ADMIN) {
			System.out.print(ErrorMessages.incorrectTypeOfAccount);
			return null;
		} 
		
		DBCoordinator dbcoordinator = new DBCoordinator();

		//	TODO: Come up with this string escaped corrected
		String sqlStr = SQLStrings.selectAllFromStudent(studentID); 
		
		List<ArrayList<Object>> objList = dbcoordinator.queryData(sqlStr);
		
		if(objList == null || objList.isEmpty()){
			System.out.println(ErrorMessages.missingPersonalDataForUser);
			return null;
		}
		
		List<ArrayList<String>> result = UtilMethods.convertObjListToStringList(objList);
>>>>>>> master

		return result;
	}
	
	@Override
	public Token userLogin(String x500, String password) {

		ShibbolethAuth sbAuth = new ShibbolethAuth();

		if (x500 == null || password == null)
			return null; // TODO: Check if we need to throw exceptions

		Token myToken = sbAuth.tokenGenerator(x500, password);

		return myToken;
	}

	@Override
	public List<ArrayList<String>> queryAdminPersonalData(Token token, int adminID) {
		
		if (token.type == Token.RoleType.UNDEFINED) {
			System.out.print(ErrorMessages.invalidCredentials);
			return null;
		} else if (token.type == Token.RoleType.STUDENT) {
			System.out.print(ErrorMessages.incorrectTypeOfAccount);
			return null;
		}
		
		DBCoordinator dbcoordinator = new DBCoordinator();
		
		String sqlStr = SQLStrings.selectAllFromAdmin(adminID); 
		
		List<ArrayList<Object>> objList = dbcoordinator.queryData(sqlStr);

		if(objList == null || objList.isEmpty()){
			System.out.println(ErrorMessages.missingPersonalDataForUser);
			return null;
		}
		
		List<ArrayList<String>> result = UtilMethods.convertObjListToStringList(objList);

		return result;

	}
	
	
	// admin method

	public boolean adminAddClass(Token token, int courseID, String courseName, int courseCredits, String instructor,
			String firstDay, String lastDay, String classBeginTime, String classEndTime, String weekDays,
			String location, String type, String prerequisite, String description, String department) {
		// TODO Auto-generated method stub
		Admin admin = new Admin();
		try {
			admin.adminAddClass(token, courseID, courseName, courseCredits, instructor, firstDay, lastDay,
					classBeginTime, classEndTime, weekDays, location, type, prerequisite, description, department);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	public boolean adminDeleteClass(Token token, int courseID) {
		// TODO Auto-generated method stub
		Admin admin = new Admin();
		try {
			admin.adminDeleteClass(token, courseID);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	public boolean adminEditClass(Token token, int courseID, String courseName, int courseCredits, String instructor,
			String firstDay, String lastDay, String classBeginTime, String classEndTime, String weekDays,
			String location, String type, String prerequisite, String description, String department) {
		// TODO Auto-generated method stub
		Admin admin = new Admin();
		try {
			admin.adminEditClass(token, courseID, courseName, courseCredits, instructor, firstDay, lastDay,
					classBeginTime, classEndTime, weekDays, location, type, prerequisite, description, department);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	public boolean adminAddStudentToClass(Token token, int studentID, int courseID, String grading, String courseTerm) {
		// TODO Auto-generated method stub
		Admin admin = new Admin();
		try {
			admin.adminAddStudentToClass(token, studentID, courseID, grading, courseTerm);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	public boolean adminEditStudentRegisteredClass(Token token, int studentID, int courseID, String grading,
			String courseTerm) {
		// TODO Auto-generated method stub
		Admin admin = new Admin();
		try {
			admin.adminEditStudentRegisteredClass(token, studentID, courseID, grading, courseTerm);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

}
