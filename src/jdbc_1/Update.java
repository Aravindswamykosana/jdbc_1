package jdbc_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update{

	public static void main(String[] args) {
		try {
			//load&register.
			Class.forName("com.mysql.cj.jdbc.Driver");
			//establish the connection.
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root", "root");
			//create the stmt.
			Statement s = con.createStatement();
			//execute the stmt.
			s.execute("update table1 set name='swamy' where name='aravind'");
			//close.
			con.close();
			s.close();
			System.out.println("hi....");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
