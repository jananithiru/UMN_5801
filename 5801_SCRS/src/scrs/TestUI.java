package scrs;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import scrs.ShibbolethAuth.Token; 

public class TestUI{

	@Test
	public void testDisplayStudentDetails() {
		
		// INITIALIZATION
		// INITIALIZE DB
		//fail("Not yet implemented");
		
		mySCRS testScrs = new SCRSImpl(); //TODO: Change this to SCRS from mySCRS
		
		//TODO: Where to create this object since userlogin doesn't accept sb or return sbAuth
		// This feels wrong to duplicate this. 
		
		ShibbolethAuth sbAuth = new ShibbolethAuth(); 
		
		// END OF INTIALIZATION
		
		//Note: Not doing singup, dirty insert into db, assuming alice0001 exists
		//Token myToken = sbAuth.tokenGenerator("alice001", "mypassword");
		
		Token myToken = testScrs.userLogin("alice001", "mypassword");
		
		if(myToken !=null && sbAuth.TokenAuth(myToken)) 	// 
			if(myToken.type == Token.RoleType.STUDENT){ 
				
				List<ArrayList<String>> testResult = 
						testScrs.queryStudentPersonalData(myToken, myToken.id);
				
				//TODO: How do we print the results? 
				//TODO: Field and value?
				//TODO: Return array of string resultsresult to the end user. 
				
				Iterator<ArrayList<String>> printIter = testResult.iterator();
		        while(printIter.hasNext()){
		        	Iterator<String> printInnerIter = printIter.next().iterator();
		        	while(printInnerIter.hasNext()){
		        		//metaRes.add(innerIter.next().toString());
		        		System.out.print(printInnerIter.next()+"\t");
		        	}
		        }
				
				} else if(sbAuth.TokenAuth(myToken) && myToken.type == Token.RoleType.ADMIN){ 
					//testScrs.q(myToken, myToken.id);
				}
		
		//where do I authenticate 
		//how do i decide if i should studnet.addclass or admin or add class?
		//displays results 		
	}
}
