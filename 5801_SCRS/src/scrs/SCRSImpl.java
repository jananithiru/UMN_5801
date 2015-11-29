package scrs;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import scrs.ShibbolethAuth.Token;
import java.util.Date;
import java.util.Iterator;

public class SCRSImpl implements mySCRS {

	public List<ArrayList<String>> queryStudentPersonalData(Token token, int studentID) {
		// TODO: //Assuming the request is already verified as student.
		// Done. IN higher class if this session belongs to a student then query
		// student personal data
		// iff] student is present in the student tb]\\avle,

		// TODO: Create new DBCoodinator object here or elsewhere ?
		DBCoordinator dbcoordinator = new DBCoordinator();
//
//		// TODO: Come up with this string escaped corrected
//		String sqlStr = "select * from student where id=" + studentID;

		String sqlStr = SQLStrings.selectAllFromStudent(studentID); 
		
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
		// TODO: //Assuming the request is already verified as student.
		// Done. IN higher class if this session belongs to a student then query
		// student personal data
		// iff] student is present in the student tb]\\avle,

		// TODO: Create new DBCoodinator object here or elsewhere ?
		DBCoordinator dbcoordinator = new DBCoordinator();
//
//		// TODO: Come up with this string escaped corrected
//		String sqlStr = "select * from administrator where id=" + adminID;
		
		String sqlStr = SQLStrings.selectAllFromAdmin(adminID); 
		
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

		return result;

	}
}
