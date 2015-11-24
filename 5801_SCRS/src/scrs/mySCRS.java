package scrs;

import java.util.ArrayList;
import java.util.List;

public interface mySCRS {
	DBCoordinator dbCoordinator = new DBCoordinator(); 
	List<ArrayList<String>> queryStudentPersonalData(ShibbolethAuth.Token token, int studentID);
}
