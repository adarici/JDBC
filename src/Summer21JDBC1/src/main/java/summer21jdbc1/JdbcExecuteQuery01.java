package summer21jdbc1;

import java.sql.*;

public class JdbcExecuteQuery01 {

public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//2.step: Registering gsm operator means registering to our driver (Oracle Driver)"
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//3.step: Call your friends "establish connection with the database"
		Connection con = DriverManager.getConnection( "jdbc:oracle:thin:@localhost:1521:xe", "ad","ad");
		
		//4.step: Create some sentences to tell to your friend means "Create statement"
		Statement st = con.createStatement();
		
		//5.step: Start to talk with your friend means "Create SQL Query and execute it"
		String q1 = "SELECT * FROM my_companies";
		ResultSet r1 = st.executeQuery(q1);
		
		//6.step: Do some actions according to the result
		while(r1.next()) {
			System.out.println(r1.getInt(1)+"-"+r1.getString(2));
		}
		//2. Example
		String q2 = "SELECT * FROM my_companies WHERE company_id < 102";
		ResultSet r2 = st.executeQuery(q2);
		//Note Inside the get methods both column name and column index can be used
		while (r2.next()) {
			System.out.println(r2.getString("company_name"));
		}
		System.out.println("===================");
		//3. Example: Select third company_id and company_name after sorting descending
		String q3 = "SELECT company_id, company_name "
				+ "FROM my_companies ORDER BY company_id DESC"
				+ " OFFSET 2 ROW "
				+ "FETCH NEXT 1 ROW ONLY";
		ResultSet r3 = st.executeQuery(q3);
		while (r3.next()) {
			System.out.println(r3.getInt("company_id")+"--->"+r3.getString("company_name"));
		}
		System.out.println("============");
		//4. Example: Select the company whose id is the second lowest
		String q4 = "SELECT  company_name "
				+ "FROM my_companies ORDER BY company_id ASC"
				+ " OFFSET 1 ROW "
				+ "FETCH NEXT 1 ROW ONLY";
		ResultSet r4 = st.executeQuery(q3);
		while (r4.next()) {
			System.out.println(r4.getString("company_name"));
		
		}
		
		
		//7.step: End the call means "Close the DB Connection"
		con.close();
		st.close();
		r1.close();
	}

}

