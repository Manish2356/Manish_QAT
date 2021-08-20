package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class mcon {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		
		String url = "jdbc:oracle:thin:@localhost:1521/xe";
		String username = "xe";
		String password = "xe";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url,username,password);
		System.out.println("Connection created");
		Statement stmt = con.createStatement();
		
		/*String createQuery="CREATE TABLE test2(ID NUMBER(2),NAME VARCHAR(10), SUBJECT VARCHAR(10),MARKS NUMBER(20))";
		stmt.executeUpdate(createQuery);
		
		String insertQuery="insert into test2(id, name , subject, marks) values (1, 'raju','kannada',40)";
		stmt.executeUpdate(insertQuery);
		insertQuery="insert into test2(id, name , subject, marks) values (2, 'thanos','kannada',45)";
		stmt.executeUpdate(insertQuery);
		insertQuery="insert into test2(id, name , subject, marks) values (3, 'thor','kannada',50)";
		stmt.executeUpdate(insertQuery);
		insertQuery="insert into test2(id, name , subject, marks) values (4, 'iron man','kannada',51)";
		stmt.executeUpdate(insertQuery);*/
		
		
		ResultSet rs = stmt.executeQuery("SELECT * FROM test2 ");
		
		System.out.println("Query execution" + rs);
		
		while(rs.next()) {
			System.out.println(rs.getString("id") + " : " +  rs.getString("name")+ " : " +  rs.getString("subject")+ " : " +  rs.getString("marks"));
		}
		con.close();

	}

}
