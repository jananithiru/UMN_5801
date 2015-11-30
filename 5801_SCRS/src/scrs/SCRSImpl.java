package scrs;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import scrs.ShibbolethAuth.Token;
import java.util.Date;
import java.util.Iterator;

public class SCRSImpl implements mySCRS {

	public List<ArrayList<String>> queryStudentPersonalData(Token token, int studentID) {

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

	@Override
	public boolean studentAddClass(Token token, int courseID, String grading, String courseTerm) {
		// TODO Auto-generated method stub
		Student student = new Student();
		return student.studentAddClass(token, courseID, grading, courseTerm);
	}

	@Override
	public boolean studentDropClass(Token token, int courseID) {
		// TODO Auto-generated method stub
		Student student = new Student();
	
		return false;
	}
}
