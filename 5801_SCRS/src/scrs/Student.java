package scrs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import scrs.ShibbolethAuth.Token.RoleType;

public class Student extends Person {

	boolean studentAddClass(ShibbolethAuth.Token token, int courseId, String grading, String courseTerm) {
		if (token.type == RoleType.ADMIN) {
			return false;
		}
		DBCoordinator dbCoordinator = new DBCoordinator();
		String sqlStr = "insert into course values(" + courseId + ",'" + grading + "','" + courseTerm + "')"; //id is autoincrement
		return dbCoordinator.insertData(sqlStr, dataList, typeList);

		// TODO Auto-generated method stub
		//
		// // TODO: Come up with this string escpared corrected
		// DBCoordinator dbcoordinator = new DBCoordinator();
		//
		// //"select all class which match my criteria"
		// // query for class data
		// //String sqlStr = "select * rom classe hwere course '\''"
		//
		// List<ArrayList<Object>> objList = dbcoordinator.queryData(sqlStr);
		//
		// //calc time frame for those classes
		//
		// // ideally only one classs should be returned
		// //pull the one class from the list
		// //
		// String startdate = calculateStartTimeFramefromClass(objList[i]);
		// String Enddate = calculateEndTimeFramefromClass(objList[i]);
		//
		//
		// if ( today is before than enddate and after startdate)
		// then create insert sql cmd
		// then call dbcoordinator.insertData(sqlCmd, dataList, typeList);
		// also
		// then create insert sql cmd
		// call insertDate into student and Course table
		//
		// else in not within timegram\\
		// retunr error
		//
		//
		// //TODO: Type case from Object to String
	}
}
