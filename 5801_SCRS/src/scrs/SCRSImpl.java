package scrs;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import scrs.ShibbolethAuth.Token;
import java.util.Date;

public class SCRSImpl implements mySCRS {
	
	public List<ArrayList<String>> queryStudentPersonalData(Token token, int studentID) {
		//TODO: if this session belongs to a student then query student personal data 		
		StudentDAO studentDAO = new StudentDAOImpl();
		Student s = studentDAO.getStudent(studentID);
		return null;
	}	
}
