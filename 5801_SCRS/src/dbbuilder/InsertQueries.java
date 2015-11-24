package dbbuilder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertQueries {
	static String databaseName = "jdbc:sqlite:CSRSDataBase.db";
	public static void insertStudentTable()
	  {
	    Connection c = null;
	    Statement stmt = null;
	    try {
	      Class.forName("org.sqlite.JDBC");
	      c = DriverManager.getConnection(databaseName);
	      c.setAutoCommit(false); //TODO: Fix this ? 
	      System.out.println("Opened database successfully");

	      stmt = c.createStatement();
	      
	      String userNames = "INSERT INTO SHIBBOLETHAUTH (ID, X500ACCOUNT, X500PASSWORD, USERID, USERTYPE) " +
                  "VALUES (null, 'alice001', 'mypassword', 1, 'STUDENT');"; 
	      stmt.executeUpdate(userNames);
	
	      String userNames2 = "INSERT INTO SHIBBOLETHAUTH (ID, X500ACCOUNT, X500PASSWORD, USERID, USERTYPE) " +
                  "VALUES (null, 'alice002', 'mypassword', 2, 'STUDENT');"; 
	      stmt.executeUpdate(userNames2);
	
	      String userNames3 = "INSERT INTO SHIBBOLETHAUTH (ID, X500ACCOUNT, X500PASSWORD, USERID, USERTYPE) " +
                  "VALUES (null, 'alice003', 'mypassword', 3, 'STUDENT');"; 
	      stmt.executeUpdate(userNames3);
	      
	      
	      String allValues = "INSERT INTO STUDENT (ID, FIRSTNAME, LASTNAME, DATEOFBIRTH,TYPE,GENDER,ADVISOR,PLAN,CREDITS,DEPARTMENT) " +
	                   "VALUES (1, 'Alice1', 'Liddell',  2013-10-07 ,'MS', 'Female', 'Mad Hatter', 'Graduate Degree Plan', 10, 'Computer Science');"; 
	      stmt.executeUpdate(allValues);

	      String reqdValues1 = "INSERT INTO STUDENT (ID,FIRSTNAME, LASTNAME, DATEOFBIRTH,TYPE,PLAN,CREDITS,DEPARTMENT) " +
                  "VALUES (2, 'Alice2', 'Liddell2',  2013-10-07 ,'BS',  'Graduate Degree Plan', 22, 'Computer Science');"; 
	      stmt.executeUpdate(reqdValues1);
	      
	      String reqdValues2 = "INSERT INTO STUDENT (ID,FIRSTNAME, LASTNAME, DATEOFBIRTH,TYPE,PLAN,CREDITS,DEPARTMENT) " +
                  "VALUES (3, 'Alice3', 'Liddell3',  2013-10-07 ,'BS',  'Graduate Degree Plan', 22, 'Computer Science');"; 
	      stmt.executeUpdate(reqdValues2);

	      stmt.close();
	      c.commit();
	      c.close();
	      
	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    }
	    System.out.println("Records created successfully");
	  }	
	
	public static void main(String args[]) {
		insertStudentTable();
	}

}