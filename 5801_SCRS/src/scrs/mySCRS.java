package scrs;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import scrs.ShibbolethAuth.Token; // NOTE: we need to import this 

public interface mySCRS {
	DBCoordinator dbCoordinator = new DBCoordinator(); 
	Token token = null ; 

	public Token userLogin(String x500, String password);
	public List<ArrayList<String>> queryStudentPersonalData(ShibbolethAuth.Token token, int studentID);
	public List<ArrayList<String>> queryAdminPersonalData(ShibbolethAuth.Token token, int adminID);
}
