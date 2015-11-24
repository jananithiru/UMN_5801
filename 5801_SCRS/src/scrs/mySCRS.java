package scrs;

import java.util.ArrayList;
import java.util.List;

public interface mySCRS {
	List<ArrayList<String>> queryStudentPersonalData(ShibbolethAuth.Token token, int studentID); 
}
