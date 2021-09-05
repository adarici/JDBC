package summer21jdbc1;
import java.sql.*;
public class ReviewJdbcExecuteQuery02 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//2.Step: Registering the Oracle Driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//3. Step: Establishing the Connection
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ad", "ad");
	//4. Step:  Create a statement
	Statement st = con.createStatement();
	//5. Step: 
	// Execute query and store the result

	// Select the second highest Salary from Employees Table
	
	String q3 = "SELECT * FROM employees ORDER BY salary ASC OFFSET 2 ROW FETCH NEXT 1 ROW ONLY ";
	ResultSet r3 = st.executeQuery(q3);

while (r3.next()) {
	System.out.println(
	r3.getInt(1)+" - "+r3.getString(2)+" - "+r3.getString(3)+" - "+r3.getString(4)+" \n "+
	r3.getString(5)+" / "+r3.getDate(6)+" / "+r3.getString(7)+" - "+r3.getInt(8)+" - "+
	r3.getInt(9)+" - "+r3.getInt(10)+" - "+r3.getInt(11) );
}
	
	
	}

}
