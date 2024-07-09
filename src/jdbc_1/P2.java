package jdbc_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class P2 {
	public static void main(String[] args) throws SQLException {
		//load and register.
		DriverManager.registerDriver(new Driver());
		//establish the connection.
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1?user=root&password=root");
		//creation.
		Statement s = con.createStatement();
		//execute.
		s.execute("insert into table1 values(3,'allen','allen@gmail.com','',994988889)");
		//close.
		s.close();
		con.close();
		System.out.println("done......!");
	}
}
