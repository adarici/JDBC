package summer21jdbc1;

import java.sql.*;


public class JavaExecuteQuery02 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// Register the Oracle Driver
		
		Class.forName("oracle.jdbc.driver.OracleDriver");

		// Establishing the Connection

		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ad","ad");

		// Create a statement

		Statement st = con.createStatement();
		
		//INSERT a single data into my_demo table
		String q1 = "INSERT INTO my_demo VALUES(11,'Taner','World',223)";
	
		int r1 =st.executeUpdate(q1);
		System.out.println("Row Inserted"+r1);

		
		MyDemo demo=new MyDemo(11,"Taner","World",223);
		MyDemo demo1 = new MyDemo(11,"Taner","World",223);
		System.out.println("Testing demo_id: "+ demo.getDemo_id());
	}

}
