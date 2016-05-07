import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

public class jdbcconection {

	public static void main (String[] args) throws SQLException {
		String host="localhost";
		String port="3306";
		Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/Employeeinfo", "root", "root");
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("select * from Employeeinfo where id = 1");
		while(rs.next())
		{
			System.out.println(rs.getString("name"));
			System.out.println(rs.getString("location"));

		}
	}
}
