package scrs;

import static org.junit.Assert.*;

import org.junit.Test;
import scrs.ShibbolethAuth.Token; 

public class TestSCRS {

	@Test
	public void test() {
		//fail("Not yet implemented");
		mySCRS testScrs = new SCRSImpl(); //TODO: Change this to SCRS from mySCRS
		ShibbolethAuth sbAuth = new ShibbolethAuth(); 
		Token myToken = sbAuth.tokenGenerator("alice001", "mypassword");
		System.out.println(testScrs.queryStudentPersonalData(myToken, myToken.id));
	}
}
