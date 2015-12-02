package scrs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import scrs.ShibbolethAuth.Token;

public class TestQueryPersonalInformation {

	@Test
	public void testDisplayStudentDetails() {

		// INITIALIZATION
		mySCRS testScrs = new SCRSImpl(); 
		
		// LOGIN
		ShibbolethAuth sbAuth = new ShibbolethAuth();
		Token myToken = testScrs.userLogin("alice001", "mypassword");

		if (myToken != null && sbAuth.TokenAuth(myToken)) {
			List<ArrayList<String>> testResult = testScrs.queryStudentPersonalData(myToken, myToken.id);
			Iterator<ArrayList<String>> printIter = testResult.iterator();
			while (printIter.hasNext()) {
				Iterator<String> printInnerIter = printIter.next().iterator();
				while (printInnerIter.hasNext()) {
					System.out.print(printInnerIter.next() + "\t");
				}
			}
		}
	}

	@Test
	public void testDisplayInvalidAdminDetails() {

		// INITIALIZATION

		mySCRS testScrs = new SCRSImpl();

		ShibbolethAuth sbAuth = new ShibbolethAuth();
		Token myToken = testScrs.userLogin("bob999", "mypassword");

		if (myToken != null && sbAuth.TokenAuth(myToken)) //
			if (myToken.type == Token.RoleType.STUDENT) {

				List<ArrayList<String>> testResult = testScrs.queryStudentPersonalData(myToken, myToken.id);

				Iterator<ArrayList<String>> printIter = testResult.iterator();
				while (printIter.hasNext()) {
					Iterator<String> printInnerIter = printIter.next().iterator();
					while (printInnerIter.hasNext()) {
						// metaRes.add(innerIter.next().toString());
						System.out.print(printInnerIter.next() + "\t");
					}
				}

			} else if (myToken.type == Token.RoleType.ADMIN) {

				List<ArrayList<String>> testResult = testScrs.queryAdminPersonalData(myToken, myToken.id);

				Iterator<ArrayList<String>> printIter = testResult.iterator();
				while (printIter.hasNext()) {
					Iterator<String> printInnerIter = printIter.next().iterator();
					while (printInnerIter.hasNext()) {
						// metaRes.add(innerIter.next().toString());
						System.out.print(printInnerIter.next() + "\t");
					}
				}
			}
	}

	@Test
	public void testDisplayValidAdminDetails() {

		
		mySCRS testScrs = new SCRSImpl(); 
		
		ShibbolethAuth sbAuth = new ShibbolethAuth();
		Token myToken = testScrs.userLogin("bob111", "mypassword");

		if (myToken != null && sbAuth.TokenAuth(myToken)) //
			if (myToken.type == Token.RoleType.STUDENT) {

				List<ArrayList<String>> testResult = testScrs.queryStudentPersonalData(myToken, myToken.id);

				Iterator<ArrayList<String>> printIter = testResult.iterator();
				while (printIter.hasNext()) {
					Iterator<String> printInnerIter = printIter.next().iterator();
					while (printInnerIter.hasNext()) {
						System.out.print(printInnerIter.next() + "\t");
					}
				}

			} else if (myToken.type == Token.RoleType.ADMIN) {

				List<ArrayList<String>> testResult = testScrs.queryAdminPersonalData(myToken, myToken.id);

				Iterator<ArrayList<String>> printIter = testResult.iterator();
				while (printIter.hasNext()) {
					Iterator<String> printInnerIter = printIter.next().iterator();
					while (printInnerIter.hasNext()) {
						System.out.print(printInnerIter.next() + "\t");
					}
				}
			}
	}
}
