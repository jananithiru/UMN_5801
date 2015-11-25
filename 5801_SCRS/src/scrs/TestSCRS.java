package scrs;

import static org.junit.Assert.*;

import org.junit.Test;
import scrs.ShibbolethAuth.Token; 

public class TestUI{

	@Test
	public void testDisplayStudentDetails() {
		
		// INITIALIZATION
		// INITIALIZE DB
		//fail("Not yet implemented");
		mySCRS testScrs = new SCRSImpl(); //TODO: Change this to SCRS from mySCRS
				
		ShibbolethAuth sbAuth = new ShibbolethAuth(); 
		
		// END OF INTIALIZATIOn 
		
		//Note: Not doing singup, dirty insert into db, assuming alice0001 exists
		Token myToken = sbAuth.tokenGenerator("alice001", "mypassword");
		
		if(myToken !=null && sbAuth.TokenAuth(myToken)) 
			if(myToken.type == Token.RoleType.STUDENT){ 
				testScrs.queryStudentPersonalData(myToken, myToken.id);
				} else if(sbAuth.TokenAuth(myToken) && myToken.type == Token.RoleType.ADMIN){ 
					testScrs.queryAdminPersonalData(myToken, myToken.id);
				}
		
		//where do I authenticate 
		//how do i decide if i should studnet.addclass or admin or add class?
		//displays results 
		
		myToken.ro
	
		
	}
}
